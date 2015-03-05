package com.joshua.queue;

public interface QueueSpec<T> {
	boolean enqueue(T val);
	T dequeue();
}
