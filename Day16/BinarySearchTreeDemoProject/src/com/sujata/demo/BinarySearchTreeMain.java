package com.sujata.demo;

public class BinarySearchTreeMain {

	public static void main(String[] args) {
		BinarySearchTree binarySearchTree=new BinarySearchTree();
		
		binarySearchTree.insert(50);
		binarySearchTree.insert(5);
		binarySearchTree.insert(100);
		binarySearchTree.insert(25);
		binarySearchTree.insert(17);
		binarySearchTree.insert(90);
		
		binarySearchTree.inorder();
		
		binarySearchTree.deleteKey(17);
		binarySearchTree.inorder();

	}

}
