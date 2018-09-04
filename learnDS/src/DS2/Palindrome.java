package DS2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) throws IOException {
	
//		HashMap hm = new HashMap();
//		
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		 int t=Integer.parseInt(br.readLine());
////		int t = s.nextInt();
//		for(int i=0; i<t; i++){
//		    String ss = br.readLine().toLowerCase();
//		    System.out.println(ss);
//		    char[] c = ss.toCharArray(); 
//		     
//		    StringBuilder sb = new StringBuilder();
//		    StringBuilder sb1 = new StringBuilder();
//		    for (int k=0; k<c.length; k++){
//		    	if(Character.isLetter(c[k])||Character.isDigit(c[k])) {
//		    		sb1.append(c[k]);
//		    	}   
//		    }
//		    for (int j=c.length-1; j>=0; j--){
//		    	if(Character.isLetter(c[j])||Character.isDigit(c[j])) {
//		    		sb.append(c[j]);
//		    	}  
//		    }
//		    System.out.println(sb.toString());
//		    System.out.println(sb1.toString()); 
//		    String s1 = sb.toString().trim();
//		    String s2 = sb1.toString().trim();
//		    if (s2.equals(s1)){
//		        System.out.println("YES");
//		    }
//		    else{
//		        System.out.println("NO");
//		    }
//		}
		
		
		String s = "popsdpop";
		char[] c = s.toCharArray();
		int i=0;
		int j=c.length-1;
		boolean flag = true;
		while(i<=j) {
			
			if(c[i]==c[j]) {
				i++;
				j--;
			}
			else {
				flag=false;
				break;
			}
			
		}
		
		System.out.println(flag);
			}

	

}
