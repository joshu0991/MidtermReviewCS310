package com.joshua.bst;

public interface BstType<T> {
	void inOrder(BNode<T> n);
	void postOrder(BNode<T> n);
	void preOrder(BNode<T> n);
	void insert(T val, BNode<T> temp);
	boolean delete(T val);
	boolean balance();
}
