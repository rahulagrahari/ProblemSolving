package DS2;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class anagram {

	public static int anagram(String a, String b) {
		
		mergeSort sort = new mergeSort(); 
		char[] s1 = a.toCharArray();
		char[] s2 = b.toCharArray();
		Arrays.sort(s1);
		Arrays.sort(s2);
//		s1 = sort.quicksort(s1, 0, s1.length-1);
//		s2 = sort.quicksort(s2, 0, s2.length-1);
		int i = 0;
		int j=0;
		int count=0;
		while(i<s1.length && j<s2.length) {
			if (s1[i]==s2[j]) {
				i++;
				j++;
			}
			else if(s1[i]>s2[j]) {
				
				count++;
				j++;
			}
			else {
				count++;
				i++;
			}
		}
		
		if(i<s1.length || j<s2.length) count++;
		return count;
		
	}
	
	public static void main(String[] args) {
		
		String s1 = "rahul";
		String s2 = "mhqru";
		
		
		System.out.println(anagram(s1, s2));
		

	}

}
