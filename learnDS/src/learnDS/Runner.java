package learnDS;

import java.util.Arrays;
import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
			LinkedList ll = new LinkedList();
			ll.insert(10);
			ll.insert(20);
			ll.insert(30);
			ll.insert(40);
			Node b1 = ll.insert(ll.head, 60);
			Node b2 = ll.insert(b1, 35);
			Node b3 = ll.insert(b2, 45);
			Node b4 = ll.insert(ll.head.getNext(), 25);
			Node b5 = ll.insert(ll.head.getNext().getNext(), 101);
			Node b6 = ll.insert(b5, 120);
			Node b7 = ll.insert(b6, 130);
			Node b8 = ll.insert(ll.head.getNext().getNext().getNext(), 8);
			ll.flattenLinkedList();
		

			
	}

}
