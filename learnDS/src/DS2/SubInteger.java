package DS2;

public class SubInteger {

	public static int rec(int[] arr, int total, int i) {
		
		if(total == 0) {
			return 1;
		}
		else if(total<0) {
			return 0;
		}
		else if(i<0) {
			return 0;
		}
		else if(total<arr[i]) {
			return rec(arr, total, i-1);
		}
		else {
			return rec(arr, total-arr[i], i-1) + rec(arr, total, i-1);
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,4,6,10};
		System.out.println(rec(arr, 16, arr.length-1));

	}

}
