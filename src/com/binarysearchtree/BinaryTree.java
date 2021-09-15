package com.binarysearchtree;

/**
 * @author saneeths
 *class where all the binary search tree operations are done
 * @param <K> key for the node
 */
public class BinaryTree<K extends Comparable<K>> {
	private BinaryNode<K> root;
	
	/**this method is used to add a key to the node 
	 * @param key
	 */
	public void add(K key) {
		this.root  = this.addRecursively(root,key);
	}

	/**this is the recursive method which is called in add node method
	 * here if the node is smaller than root node it is placed left and otherwise
	 * right
	 * @param curr this is the cuurent root node
	 * @param key
	 * @return
	 */
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
	
	/**
	 * this method is used to print the entire tree
	 */
	public void printTree() {
		this.printNode(root);
	}

	/**this method is used to print each node in the tree recursively it is called in
	 * printTree function 
	 * @param curr
	 */
	public void printNode(BinaryNode<K> curr) {
		if(curr == null) return;
		printNode(curr.left);
		System.out.print(curr.key+" ");
		printNode(curr.right);
	}
	
	/**this method is used to get the size of the tree
	 * @return
	 */
	public int getSize() {
		return this.getSizeRecursive(root);
	}

	/**this method is used to count each number of node recursively
	 * @param curr
	 * @return
	 */
	private int getSizeRecursive(BinaryNode<K> curr) {
		return curr == null?0:1+getSizeRecursive(curr.left)+getSizeRecursive(curr.right);
	}
	
	/**This method is used to check whether the key is present or not
	 * @param key
	 */
	public void search(K key) {
		this.searchNode(key, root);
	}

	/**this method is used to search each and every node recursively
	 * @param key
	 * @param curr
	 */
	private void searchNode(K key, BinaryNode<K> curr) {
		if(curr == null) {
			System.out.println("Node not found!!");
			return;
		}
		int result = key.compareTo(curr.key);
		if(result == 0) System.out.println(key+" is found");
		else if(result<0) searchNode(key,curr.left);
		else searchNode(key, curr.right);
	}
}
