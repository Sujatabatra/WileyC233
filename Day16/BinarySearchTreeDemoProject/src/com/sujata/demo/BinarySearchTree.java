package com.sujata.demo;

public class BinarySearchTree {

	class Node{
		int key;
		Node left,right;
		public Node(int key) {
			super();
			this.key = key;
			left=right=null;
		}
	}
	Node root;
	
	void insert(int key) {
		root=insertRec(root, key);
	}
	
	Node insertRec(Node root,int key) {
		/*
		 *if tree is empty, return a new node 
		 */
		if(root==null) {
			root=new Node(key);
			return root;
		}
		if(key<root.key)
			root.left=insertRec(root.left,key);
		else if(key>root.key)
			root.right=insertRec(root.right,key);
		
		return root;
	}
	
	void inorder() {
		inorderRec(root);
		
	}
	
	void inorderRec(Node root) {
		if(root!=null) {
			inorderRec(root.left);
			System.out.println(root.key);
			inorderRec(root.right);
		}
	}
}
