package com.sujata.assignment;

import com.sujata.demo.BinarySearchTree;

public class MainClass {

	public static void main(String[] args) {
		DigitAndOccuranceBinarySearchTree tree = new DigitAndOccuranceBinarySearchTree();

		tree.insert(5);
		tree.insert(7);
		tree.insert(2);
		tree.insert(5);
		tree.insert(7);
		tree.insert(9);

		tree.inorder();

	}

}
