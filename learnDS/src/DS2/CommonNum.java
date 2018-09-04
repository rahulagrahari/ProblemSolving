package DS2;

import java.util.ArrayList;

public class CommonNum {
	
	public static ArrayList<Integer> commonNum(int[] a, int[] b) {
		int p1=0;
		int p2=0;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		while(p1<a.length || p2<b.length) {
			
			if(p1==a.length || p2==b.length) {
				break;
			}
		    else if(a[p1]==b[p2]) {
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
		int[] a = {1,2,3,5,8,9,15};
		int[] b = {1,2,4,5,6,8,9,11,15};
		ArrayList<Integer> arr = commonNum(a, b);
//		System.out.println(arr.size());
		for(Integer i:arr) {
			System.out.println(i);
		}
		
	}

}
