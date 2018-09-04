package DS2;

public class MaxMin {
	public static void main(String[] args) {
		int[] a = {22,66,33,98,56,345,9};
		int min=100000;
		int max=0;
		for(int i : a) {
			if(i<min) {
				min = i;
			}
			else if(i>max) {
				max = i;
			}
		}
		
		System.out.println(max+"-"+min+" "+(max-min));
	}
}
