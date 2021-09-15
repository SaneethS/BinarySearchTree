package com.binarysearchtree;

/**
 * @author saneeths
 *this is the class where each node is defined
 * @param <K>
 */
public class BinaryNode<K extends Comparable<K>> {
	K key;
	BinaryNode<K> left;
	BinaryNode<K> right;
	
	public BinaryNode(K key) {
		this.key = key;
		this.left = null;
		this.right = null;
	}
}
