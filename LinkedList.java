package Outlab3;

import java.io.File;
import java.nio.file.Files;
import Outlab3.Node;

public class LinkedList {

	Node first = new Node(1);
	public Node prev = first;
    public Node next = first;
	private Node mPointer; // last element
	private Node kPointer;
		 
	private int size = 0;
	
	public LinkedList() {
		first.setNext(next);
		first.setPrev(prev);
		size++;
	}
	
	public int size() {
		return size;
	}
	
	 public void add (int data){

		Node node = new Node(data);
		prev.setNext(node);
		node.setPrev(prev);
		node.setNext(first);
		prev = node;
		next.setPrev(prev);
		
	    size++;
	    
	  }
	 
	 public void remove(Node data) {
		if (first == null){
		    System.out.println("List is empty");
		}else {
			Node toRemove = data;    
	        prev = first.getPrev();
	    	next = first.getNext();
	    			        
	        while ((data.getData() != toRemove.getData()) && (toRemove != first)){
	        	
	            toRemove = toRemove.getNext();
	        }
	        if(toRemove == mPointer) {
	        	mPointer = mPointer.getPrev();
	        } else if(toRemove == kPointer) {
	        	kPointer = kPointer.getNext();
	        }
	        if (toRemove != first){
	            prev = toRemove.getPrev();
	            next = toRemove.getNext();
	            prev.setNext(next);
	            next.setPrev(prev);
	        } else {
	        	if (toRemove == toRemove.getNext()) {
	        		first = null;
	        	} else {
		    		first = first.getNext();
		    		prev = toRemove.getPrev();
		            next = toRemove.getNext();
		            prev.setNext(next);
		            next.setPrev(prev);
	        	}
	        }
		size--;
		}
	 }

	 public void moveM(int m) {
		 for(int i = 1; i < m; i++) {
			 mPointer = mPointer.getPrev();
		 }
	 }
	 
	 public void moveK(int k) {
		 for(int i = 1; i < k; i++) {
			 kPointer = kPointer.getNext();
		 }
	 }
	 
	 
	 public String compute(int N, int m, int k) {
		 kPointer = first;
		 mPointer = first.getPrev();
		 String answer = "";
		 String text = "";
		 

		 boolean notEmpty = true;
		 if (first == null) {
			 System.out.println("List is empty. ");
			 answer = null;
		 } else {
			 moveK(k);
			 moveM(m);
			 while(notEmpty) {
				 if (mPointer == kPointer ) {
					 answer += kPointer.getData()+ " ";
					 if (kPointer.getNext()== kPointer) {
						 System.out.println("All done");
						 notEmpty = false;
					 } else {
						 remove(kPointer);
					 }
				 } else {
					 remove(kPointer);
					 remove(mPointer);
					 moveK(k);
					 moveM(m);
					 text += kPointer.getData() + " " + mPointer.getData() + "\n";
					 
				 }
			 }
		 }
		 text += answer + "\n";
		 return text;
	 }

}
