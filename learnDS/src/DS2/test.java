package DS2;

import java.util.Date;

public class test {
	
	
	static long fib(int n,long[] memo) {
       
    	   if (memo[n-1]!=0) {
    		   return memo[n-1];
    	   }
    	   else if(n==1 || n==2) {
    		   return 1;
    	   }
    	   else { 
    		   
    		   long result = fib(n-1, memo) + fib(n-2, memo);
    		   memo[n-1] = result;
    		   return result;
    	   }
       }
	
	static long fib1(int n) {
	       
 	   if(n==1 || n==2) {
 		   return 1;
 	   }
 	   else {
 		   
 		   long result = fib1(n-1) + fib1(n-2);
 		   return result;
 	   }
    }
    
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int num = 40;
//		long[] memo = new long[num];
//		Date start = new Date();
//		System.out.println(test.fib(num,memo));
//		Date end = new Date();
		System.out.println(" total time in millisecond");

	}

}
