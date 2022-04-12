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
	
	Node search(Node root,int key) {
		if(root==null || root.key==key)
			return root;
		if(root.key<key)
			return search(root.right,key);
		
		return search(root.left,key);
	}
	
	void deleteKey(int key) {
		root=deleteRec(root, key);
	}
	
	Node deleteRec(Node root,int key) {
		if(root==null)
			return root;
		if(key<root.key)
			root.left=deleteRec(root.left, key);
		else if(key>root.key)
			root.right=deleteRec(root.right, key);
		else {
			if(root.left==null)
				return root.right;
			else if(root.right==null)
				return root.left;
			
					
			
			root.key=minValue(root.right);
			
			root.right=deleteRec(root.right, root.key);
		}
		return root;
	}
	
	int minValue(Node root) {
		int minVal=root.key;
		while(root.left!=null) {
			minVal=root.left.key;
			root=root.left;
		}
		return minVal;
	}
}
