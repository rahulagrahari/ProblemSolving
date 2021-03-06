package DS2;
import learnDS.LinkedList;
import java.util.ArrayList;

public class DFS {
	
	public static ArrayList getValidPath(int[][] matrix, int i, int num) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int j=0;
		while(num+1>0) {
		if(matrix[i][j]==1) {
				arr.add(j);
			}
		j++;
		num--;
		}
		return arr;
		
	} 
	public static ArrayList<Integer> depthFirstSearch(int[][] matrix,int k, int i) {
		ArrayList<Integer> visited = new ArrayList<Integer>();
		ArrayList<Integer> path = new ArrayList<Integer>();
		Stack s = new Stack();
		s.push(i);
		while(s.isEmpty()==false) {
			int item = s.pop();
			i = item;
			visited.add(i);
//			if(i==k) {
//				break;
//			}
			path = getValidPath(matrix, i, k);
			for(int m=path.size()-1;m>=0;m--)
			{
				if(!visited.contains(path.get(m))) {
					s.push(path.get(m));

				}
			}
			
		}
		return visited;
		
	}
	
	public static ArrayList<Integer> breadthFirstSearch(int[][] matrix,int k, int i) {
		ArrayList<Integer> visited = new ArrayList<Integer>();
		ArrayList<Integer> path;
		LinkedList ll = new LinkedList();
		visited.add(i);
		ll.insert(i);
		while(!ll.isEmpty()) {
			int item = ll.dequeue();
			i = item;
			if(i==k) {
				break;
			}
			path = getValidPath(matrix, i, k);
			for(int m:path)
			{
				if(!visited.contains(m)) {
					ll.insert(m);
					visited.add(m); 
					
				}
			}
			
		}
		return visited;
		
	}
	public static ArrayList<Integer> allPath(int[][] matrix,int k, int i) {
		ArrayList<Integer> childNode = new ArrayList<Integer>();
		ArrayList<Integer> path = new ArrayList<Integer>();
		ArrayList<Integer> temp = new ArrayList<Integer>();
		
		if(i==k) {
			path.add(i);
			return path; 
		}
		else {
			childNode = getValidPath(matrix, i, k);
			if(childNode.size()!=0) {
				for(int m : childNode) {
					temp=allPath(matrix, k, m);
					if(temp.size()!=0) {
						path.addAll(temp);
						path.add(i);
					}
					
				}
			}
			
			return path;
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = 
			{
			{0,1,1,0,0,0},
			{0,0,0,1,1,0},
			{0,0,0,0,1,0},
			{0,0,0,0,0,1},
			{0,0,0,0,0,1},
			{0,0,0,0,0,0}
			};
		ArrayList<Integer> arr = depthFirstSearch(matrix, 5, 0);
		int s = arr.size();
		for(int i : arr) {
			if(s-1==0) {
				System.out.println("GOAL");
			}
			else {
			System.out.print((i+1)+"-->");
			s--;
			}
		}
		

	}

}
