package com.joshua.bst;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AVLTree<String> tree = new AVLTree<String>("Top");
		String z = new String("penguin");
		String d = new String("Hello");
		String s = new String("world");
		String a = new String("Pig");
		String q = new String("Quebec");
		String n = new String("Novemeber");
		tree.insert(z, tree.getRoot());
		tree.insert(d, tree.getRoot());
		tree.insert(s, tree.getRoot());
		tree.insert(a, tree.getRoot());
		tree.insert(q, tree.getRoot());
		tree.insert(n, tree.getRoot());
		tree.inOrder(tree.getRoot());
	}

}
