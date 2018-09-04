package DS2;

public class BInarySearch { 
	
	public static int search(int[] arr, int num, int l, int r) {
		
		int mid = (l+r)/2;
		if (l<=r) {		
		if (arr[mid]==num) {
			return mid;
		}
		else if(arr[mid]>num) { 
			return search(arr, num, l, mid-1);
		}
		else if(arr[mid]<num){
			return search(arr, num, mid+1, r);
		}
		
		}
		return -1;
		
	}
public static void main(String[] args) {
	int[] arr = {4,5,7,44,99};
	int i = BInarySearch.search(arr, 100, 0, arr.length-1);
	System.out.println(i);
}
}
