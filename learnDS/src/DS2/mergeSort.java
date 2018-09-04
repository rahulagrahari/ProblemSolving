package DS2;

import javax.lang.model.element.QualifiedNameable;

public class mergeSort {
	
	
	public static char[] quicksort(char[] a, int i, int j) {
		int k;
		
		if(i<j) {
			k=partition(a, i, j);
			quicksort(a, i, k);
			quicksort(a, k+1, j);
		}
	return a;
	}
	
	 
	private static int partition(char[] arr, int start, int last) {
		int i = start;
		int j=last;
		char pivot;
		pivot=arr[i];
		while(i<j) {
			do {
				if(i>=last) {
					break;
				}
				i++;
				
			}while(arr[i]<pivot);
			while(arr[j]>pivot){
				 if(j<=start) {
						break;
					}
				j--;
				
			}
			
			 if(arr[i]>arr[j] && i<j) {
				char temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
				
		}
		char temp = pivot;
		arr[start]=arr[j];
		arr[j]=temp;
		return j;
	}

}
