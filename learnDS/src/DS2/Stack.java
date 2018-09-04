package DS2;

import java.util.ArrayList;

public class Stack {

	
	private static ArrayList<Integer> arr;
	public Stack() {
		arr = new ArrayList<Integer>();
	}
	
	public static void push(int i) {
		arr.add(i);
	}
	
	public static int pop() {
		int a = arr.size();
		int b = arr.get(a-1);
		arr.remove(a-1);
		return b;
		
	}
	public boolean isEmpty(){
		
		return arr.isEmpty();
	}
	public void displayStack(){

		for(int i=arr.size()-1;i>=0;i--) 
		{
			System.out.println("|"+arr.get(i)+"|");
			System.out.println("|--|");
		}
		
	}
	
}
