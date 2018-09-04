package DS2;

import learnDS.LinkedList;
import learnDS.Node;

public class BST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.insert(10);
		Node l1 = ll.leftChild(ll.getHead(), 6);
		Node r1 = ll.rightChild(ll.getHead(), 15);
		Node l1l1=ll.leftChild(l1, 4);
		Node l1r1=ll.rightChild(l1, 8);
		Node r1l1=ll.leftChild(r1, 11);
		Node r1r1=ll.rightChild(r1, 16);
		boolean b = isBST(ll.getHead(), -1,-1);
		System.out.println(b);
	}
	public static boolean isBST(Node root, int llimit, int ulimit) {
	
		
		if(llimit!=-1 && root.getVal()<llimit) {
			return false;
		}
		else if(ulimit!=-1 && root.getVal()>ulimit) {
			return false;
		}
		else {
			boolean a=true;
			boolean b=true;
			if(root.getBottom()!=null) {
				a = isBST(root.getBottom(), llimit, root.getVal());
			}
			if(root.getNext()!=null) {
				b = isBST(root.getNext(), root.getVal(), ulimit);}
			return a && b;
			 
		}
		
	}
}
