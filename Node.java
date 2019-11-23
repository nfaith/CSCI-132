package Outlab3;


public class Node {
	
	private int element;
	private Node prev;
	private Node next;
	
	public Node(int e) {
		element = e;
		this.prev = prev;
		this.next = next;
	}
	
	// This is how you retrieve the current element. 
	public int getData() {
		return element;
	}
	
	// This is one access the previous element. 
	public Node getPrev(){
		return prev;
	}
	
	// This is how one accesses the next element.
	public Node getNext(){
		return next;
	}
	
	// This is how one sets the previous element.
	public void setPrev(Node p) {
		prev = p;
	}
	
	// This is how one set the next element.
	public void setNext(Node n) {
		next = n;
	}
}