package DS2;

import java.util.Scanner;

public class RemoveZero {
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in); 
//		int testNum = s.nextInt();
//		int[] arr = null;
//	    for(int i=0; i<testNum; i++)
//	    {
//	        int arrSize = s.nextInt();
//		    arr = new int[arrSize];
//	        for(int j=0; j<arrSize;j++){
//		        arr[j]=s.nextInt();
//		    }
//		    int a=0;
//		    int temp1=-1;
//		    int temp2=-1;
//		    while(arrSize>0) {
//		    	if(arr[a]==0) {
//		    		temp2 = arr[a];
//		    		for (int k =a+1; k<arr.length;k++) {
//		    			if (arr[k]!=0) {
//		    				temp1 = arr[k];
//		    				arr[k]=temp2;
//		    				arr[a]=temp1;
//		    				break;
//		    			}			    			
//		    		}
//		    	}
//		    	a++;
//		    	arrSize--;
//		    }
//	        
//	        for (int m = 0; m<arr.length; m++) {
//	    	System.out.print(arr[m] + " ");
//	    }
//	    System.out.println();
//	        
//	    }
//}
	public static void main (String[] args) {
		//code
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
//		System.out.println(t);
		int arrSize = s.nextInt();
		System.out.println(arrSize);
		int[] arr = new int[arrSize];
		int k = 0;
		int l = 0;
		
		 for(int j=0; j<t; j++){
		    for(int i=0; i<arrSize; i++){
		    	int temp = s.nextInt();
//		        if(temp==0){
//		            arr[arrSize-1-k]=temp;
//		            k++;
//		        }
//		        else{
//		            arr[l]=temp;
//		            l++;
//		        }
		    	if (temp!=0) {
		    		System.out.print(temp+" ");
		    	}
		    	else {
		    		l++;
		    	}
		    }
		    for(int i =0; i<l;i++){
		        System.out.print(0+" ");
		    }
		    System.out.println();
		   
		}
	}
}
