package DS2;

public class longestCommonSubsequence {

	public static int LCS(char[] a, char[] b, int i, int j, int[][] memo) {
		if(i==a.length || j==b.length) {
			return 0;
		}
		else if(memo[i][j]!=0) {
		return memo[i][j];
		}
		else if(a[i]==b[j]) {
			return 1+LCS(a,b,i+1,j+1,memo);
		}
		else {
			int m = LCS(a,b,i+1,j,memo);
			int n = LCS(a,b,i,j+1,memo);
			if(m>n) {
				memo[i][j]=m;
				return m;
				}
			
			else 
				{
				memo[i][j]=n;
				return n;}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "ababbc";
		String b = "bababc";
		int[][] memo = new int[a.length()][b.length()];
		int k = LCS(a.toCharArray(), b.toCharArray(), 0,0,memo);
		System.out.println(k);

	}

}
