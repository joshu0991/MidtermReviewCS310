package com.joshua.stack;
public interface Stack<T>{
	void push(T data);
	LLNode<T> pop();
	T peek();
}
