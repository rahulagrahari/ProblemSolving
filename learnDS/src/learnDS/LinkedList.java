package learnDS;

import java.util.ArrayList;

public class LinkedList {

	Node head;

	public Node getHead() {
		return head;
	}

	public void insert(int val) {

		Node node = new Node(val, null, null);
		if (head == null) {

			head = node;
		} else {
			Node n = head;
			while (n.getNext() != null) {
				n = n.getNext();
			}
			n.setNext(node);
		}

	}
	
	public Node insert(Node n, int val) {

		Node node = new Node(val, null, null);
		n.setBottom(node);
		return node;

	}

	public Node leftChild(Node n, int val) {

		Node node = new Node(val, null, null);
		n.setBottom(node);
		return node;
	}
	
	public Node rightChild(Node n, int val) {

		Node node = new Node(val, null, null);
		n.setNext(node);
		return node;
	}
	public void display() {
		Node n = head;
		while (n.getNext() != null) {

			System.out.print(n.getVal() + "-->");
			n = n.getNext();
		}
		System.out.println(n.getVal());
	}

	public int getNodeAt(int index) {
		Node n1 = head;
		Node n = head;
		if(index<0) {
			index = Math.abs(index);
			for (int i = 1; i < index; i++) {
				n = n.getNext();
				if (n == null) {
					System.out.println("No value at the given index");
					break;
				}
			}
			if (n != null) {
				while (n != null) {
					n = n.getNext();
					if(n==null) {
						return n1.getVal();
					}
					n1 = n1.getNext();
				}
				return n1.getVal();

			} else {
				return 0;
			}
		}
		else {
			for (int i = 1; i < index; i++) {
				n = n.getNext();
			}
			return n.getVal();
		}

	}
	public int dequeue() {
		Node n = head;
		Node temp=n.getNext();
		head = temp;
		return n.getVal();
	}
	public boolean isEmpty() {
		if (head == null) return true;
		else return false;
	}
	public int getMidVal() {
		Node n1 = head;
		Node n2 = head;
		
		while(n1.getNext()!=null && n2.getNext()!=null) {
			n1=n1.getNext().getNext();
			
			n2=n2.getNext();	
			if(n1==null) {
				break;
			}
		}
		return n2.getVal();
	}
	
	public void flattenLinkedList() {

		Node bottom = head.getBottom();
		Node left = head;
		while(left!=null) {
			System.out.print(left.getVal());
			System.out.print("-->");
			while(bottom!=null) {
				System.out.print(bottom.getVal());
				System.out.print("-->");
				bottom=bottom.getBottom();
			}
			left=left.getNext();
			if(left!=null)
			bottom=left.getBottom();
			
		}
	}

}
