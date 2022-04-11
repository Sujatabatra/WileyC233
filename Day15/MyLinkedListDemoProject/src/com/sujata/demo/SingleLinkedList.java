package com.sujata.demo;

public class SingleLinkedList {

	class Node{
		int data;
		Node next;
		public Node(int data, Node next) {
			super();
			this.data = data;
			this.next = next;
		}
	}
	private Node head;
	
	public boolean insert(int data) {
		Node newNode=new Node(data, null);
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
			
		}
		return true;
	}
	
	public void traverse() {
		Node iterator=head;
		while(iterator!=null) {
			System.out.println(iterator.data);
			iterator=iterator.next;
		}
			
	}
}
