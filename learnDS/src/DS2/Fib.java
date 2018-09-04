package DS2;

public class Fib {
public static void main(String[] args) {
	System.out.println(0);
	System.out.println(1);
	long sum=1;
	long temp1=0;
	long temp2=1;
	for(int i=0; i<10; i++) {
		 
		sum=temp1+temp2;
		temp1=temp2;
		temp2=sum;	
		System.out.println(sum);

	}
}// 0 1 1 2 3 5 8 13 ....
}
