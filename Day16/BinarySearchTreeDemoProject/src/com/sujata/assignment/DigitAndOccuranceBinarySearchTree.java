package com.sujata.assignment;



public class DigitAndOccuranceBinarySearchTree {

	class Node{
		int digit,occurance;
		Node left,right;
		public Node(int digit) {
			super();
			this.digit = digit;
			this.occurance = 1;
			left=right=null;
		}
		
	}
	Node root;
	
	void insert(int key) {
		Node cur=search(root, key);
		if(cur!=null) {
			cur.occurance++;
		}
		else
			root=insertRec(root, key);
	}
	
	Node insertRec(Node root,int digit) {
		/*
		 *if tree is empty, return a new node 
		 */
		if(root==null) {
			root=new Node(digit);
			return root;
		}
		if(digit<root.digit)
			root.left=insertRec(root.left,digit);
		else if(digit>root.digit)
			root.right=insertRec(root.right,digit);
		
		return root;
	}
	
	void inorder() {
		inorderRec(root);
		
	}
	
	void inorderRec(Node root) {
		if(root!=null) {
			inorderRec(root.left);
			System.out.println(root.digit+" occurance : "+root.occurance);
			inorderRec(root.right);
		}
	}
	
	Node search(Node root,int digit) {
		if(root==null || root.digit==digit)
			return root;
		if(root.digit<digit)
			return search(root.right,digit);
		
		return search(root.left,digit);
	}
}
