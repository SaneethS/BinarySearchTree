package com.binarysearchtree;

public class BinarySearchTree {
	public static void main(String[] args) {
		BinaryTree<Integer> binaryTree = new BinaryTree<>();
		binaryTree.add(56);
		binaryTree.add(30);
		binaryTree.add(70);
		
		binaryTree.printTree();
	}
}
