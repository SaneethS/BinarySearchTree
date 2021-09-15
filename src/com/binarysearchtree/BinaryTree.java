package com.binarysearchtree;

public class BinaryTree<K extends Comparable<K>> {
	private BinaryNode<K> root;
	
	public void add(K key) {
		this.root  = this.addRecursively(root,key);
	}

	public BinaryNode<K> addRecursively(BinaryNode<K> curr , K key) {
		if(curr == null)
			return new BinaryNode<>(key);
		int result = key.compareTo(curr.key);
		if(result == 0)
			return curr;
		if(result > 0) {
			curr.right = addRecursively(curr.right, key);
		}else {
			curr.left = addRecursively(curr.left, key);
		}
		return curr;
	}
	
	public void printTree() {
		this.printNode(root);
	}

	public void printNode(BinaryNode<K> curr) {
		if(curr == null) return;
		printNode(curr.left);
		System.out.print(curr.key+" ");
		printNode(curr.right);
	}
}
