package DS2;

import java.util.ArrayList;

/***
 * que: Find the common number between two sorted arrays of integer
 * eg: [2,4,5,7] [3,4,6,7]
 * sol: [4,7]
 */
public class CommonNum {

	private static ArrayList<Integer> commonNum(int[] a, int[] b) {
		int p1=0;
		int p2=0;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		while(p1<a.length || p2<b.length) {
			
			if(p1==a.length || p2==b.length) {
				break;
			}
		    if(a[p1]==b[p2]) {
				arr.add(a[p1]);
				p1++;
				p2++;
			}
			else if(a[p1]>b[p2]) {
				p2++;
			}
			else {
				p1++;
				
			}
			
		}
		return arr;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,5,8,9};
		int[] b = {1,2,4,9};
		ArrayList<Integer> arr = commonNum(a, b);
//		System.out.println(arr.size());
		for(Integer i:arr) {
			System.out.println(i);
		}
		
	}

}
