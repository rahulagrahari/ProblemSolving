package DS2;

public class MaxSquare {

	
	public static int maxSquare(int[][] matrix, int i, int j) {
		
		int[][] temp = matrix;
		int max = 0;
		for(int m=0; m<i;m++) {
			for(int n=0; n<j;n++) {
				if(m==0 || n==0) {
					
				}
				else if(matrix[m][n]>0) {
					int[] neighbor = getNeighbor(matrix, m, n);
					int[] min = new int[3];
					min[0]=temp[neighbor[0]][neighbor[1]];
					min[1]=temp[neighbor[2]][neighbor[3]];
					min[2]=temp[neighbor[4]][neighbor[5]];
					temp[m][n]=1+getMin(min);
				}
				
				if(temp[m][n]>max) {
					max=temp[m][n]; 
				}
			}
		}
		return max;
	}
	
	private static int getMin(int[] arr) {
		int min=100000;
		for(int i : arr) {
			if(i<min) {
				min=i;
			}
		}
		return min;
	}
	
	private static int[] getNeighbor(int[][] matrix, int i, int j) {
		
		int[] a = new int[6];
		a[0]=i;
		a[1]=j-1;
		a[2]=i-1;
		a[3]=j;
		a[4]=i-1;
		a[5]=j-1;
		
		return a;
		
		
	}
	
	
	public static void main(String[] args) {
		
		int[][] matrix = 
			{
			{1,1,0,1,0},
			{0,1,1,1,1},
			{1,1,1,1,1},
			{0,1,1,1,1},
			{0,1,1,1,1},
			};
		
		System.out.println(maxSquare(matrix, 5, 5));
		
	}

}
