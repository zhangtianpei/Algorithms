package algs;

import java.util.Iterator;

public class StackSelf<Item> implements Iterable<Item> {
	private Node first;
	private int N;
	
	private class Node{
		Item item;
		Node next;
	}
	
	private boolean isEmpty(){
		return N == 0;
	}
	
	private int size(){
		return N;
	}
	
	private void push(Item node){
		Node oldFirst = first;
		first = new Node();
		first.item = node;
		first.next = oldFirst;
		 
	}

	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}
