package com.joshua.bst;

public class BNode<T> {
	public BNode(T t){
		this.data = t;
	}
	private BNode<T> left;
	private BNode<T> right;
	private T data;
	private int balance = 0;
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public BNode<T> getLeft() {
		return left;
	}
	
	public void setLeft(BNode<T> left) {
		this.left = left;
	}
	
	public BNode<T> getRight() {
		return right;
	}
	
	public void setRight(BNode<T> right) {
		this.right = right;
	}
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	public String toString(){
		String s = null;
		s = (String) data;
		return s;
	}
}
