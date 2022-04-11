package com.sujata.demo;

public class DoubleLinkedList {

	class Node{
		int data;
		Node next;
		Node prev;
		public Node(int data, Node next,Node prev) {
			super();
			this.data = data;
			this.next = next;
			this.prev=prev;
		}
	}
	private Node head;
	
	public boolean insert(int data) {
		Node newNode=new Node(data, null,null);
		//if we don't have the list, create the newly created node as first node
		if(head==null) {
			head=newNode;
		}
		else {
			//if list is already there, move head to the last node and attach new node in the last
			Node lastNode=head;
			while(lastNode.next!=null) {
				lastNode=lastNode.next;
			}
//			After while last node is on last node, attach new node to the last node
			lastNode.next=newNode;
			newNode.prev=lastNode;
			
		}
		return true;
	}
	
	public void traverseForward() {
		Node iterator=head;
		while(iterator!=null) {
			System.out.println(iterator.data);
			iterator=iterator.next;
		}
			
	}
	
	public void traverseBackward() {
		Node lastNode=head;
		while(lastNode.next!=null) {
			lastNode=lastNode.next;
		}
		
		Node iterator=lastNode;
		while(iterator!=null) {
			System.out.println(iterator.data);
			iterator=iterator.prev;
		}
		
	}
}
