package DS2;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;

public class ShortestPath {
	
	public static int rec(int size, int k, int l, int i,int j) {
		
		if(i==k && j==l) {
			return 1;
		}
		else if(i==-1 && j==-1) {
			return 0;
		}
		else {
			
			int[] arr = validPath(i,j,size);
			return rec(size,k,l,arr[0],arr[1]) + rec(size, k,l,arr[2], arr[3]);
			
		}
		
	}
public static int memrec(int size, int k, int l, int i,int j, Map<String, Integer> m) {
		
		if(i==k && j==l) {
			return 1;
		}
		else if(i==-1 && j==-1) {
			return 0;
		}
		else if(m.containsKey(Integer.toString(i)+","+Integer.toString(j))){
			return m.get(Integer.toString(i)+","+Integer.toString(j));
		}
		else {
			
			int[] arr = validPath(i,j,size);
			int result = memrec(size,k,l,arr[0],arr[1],m) + memrec(size, k,l,arr[2], arr[3],m);
			m.put(Integer.toString(i)+","+Integer.toString(j), result);
			return result;
		}
		
	}
	
	public static int[] validPath(int i, int j, int gridSize) {
		int[] arr = new int[4];
		if(i>0 && j<gridSize-1) {
			arr[0]=i-1;
			arr[1]=j;
			arr[2]=i;
			arr[3]=j+1;
		}
		else if(i==0 && j==gridSize-1) {
			arr[0]=i;
			arr[1]=j;
			arr[2]=i;
			arr[3]=j;
		}
		else if(i==0 && j<gridSize-1) {
			arr[0]=-1;
			arr[1]=-1;
			arr[2]=i;
			arr[3]=j+1;
		}
		else {
			arr[0]=i-1;
			arr[1]=j;
			arr[2]=-1;
			arr[3]=-1;
			
		}
		return arr;
								
	}
	public static int shortPath(int size, int k, int l, int i,int j, int[][] matrix) {
		
		int cost1 = 0;
		int cost2=0;
		if(i==k && j==l) {
			return 1;
		}
		else {
			int[] arr = validPath(i, j, size);
			if(arr[0]==-1 &&arr[1]==-1) {
				cost2=shortPath(size, k, l, arr[2],arr[3],matrix);
				cost2=cost2+matrix[arr[2]][arr[3]];
				return cost2;
			}
			else if(arr[2]==-1 &&arr[3]==-1) {
				cost1 = shortPath(size, k, l, arr[0],arr[1],matrix);
				cost1=cost1+matrix[arr[0]][arr[1]];
				return cost1;
			}
			else {
				cost1 = shortPath(size, k, l, arr[0],arr[1],matrix);
				cost1=cost1+matrix[arr[0]][arr[1]];
				cost2=shortPath(size, k, l, arr[2],arr[3],matrix);
				cost2=cost2+matrix[arr[2]][arr[3]];
				if(cost1>cost2) return cost2;
				else return cost1;
					
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> m = new HashMap<String, Integer>();
		int[][] matrix = 
			{{7,4,1,1},
			 {4,2,3,2},
			 {7,3,5,6},
			 {1,1,7,2}};
		Date start = new Date();
//		int i = memrec(20, 0,19,19,0,m);
		int i = shortPath(4, 0, 3, 3, 0, matrix);
		Date end = new Date();
		long a = end.getTime()-start.getTime();
		System.out.println(i+" : total time in "+ a+" millisecond");

	}

}
