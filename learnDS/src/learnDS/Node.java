package learnDS;

public class Node {

	private int val;
	private Node next;
	private Node bottom;
	
	public Node(int val, Node next, Node bottom) {
		this.val = val;
		this.next = next;
		this.bottom=bottom;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	public Node getBottom() {
		return bottom;
	}

	public void setBottom(Node bottom) {
		this.bottom = bottom;
	}
	
	
	
}
