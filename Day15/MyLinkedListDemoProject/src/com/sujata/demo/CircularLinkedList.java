package com.sujata.demo;

public class CircularLinkedList {

	class Node {
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
		Node newNode = new Node(data, null);
		// if we don't have the list, create the newly created node as first node
		if (head == null) {
			head = newNode;
			head.next=head;
		} else {
			// if list is already there, move head to the last node and attach new node in
			// the last
			Node lastNode = head;
			while (lastNode.next != null) {
				lastNode = lastNode.next;
			}
//			After while last node is on last node, attach new node to the last node
			lastNode.next = newNode;
			newNode.next=head;

		}
		return true;
	}

	public void traverse() {
		Node iterator = head;
		while (iterator.next != head) {
			System.out.println(iterator.data);
			iterator = iterator.next;
		}
		if(iterator!=head)
			System.out.println(iterator.data);

	}

	public boolean delete(int data) {
		if(head!=null) {
			//want to delete first Node
			if(head.data==data)
				head=head.next;
			else {
				Node prev=head;
				while(prev.next!=head && prev.next.data!=data) {
					prev=prev.next;
				}
				if(prev.next!=head)
					prev.next=prev.next.next;
				else
					return false;
			
			}
		}
		else {
			return false;
		}
		return true;
	}
}
