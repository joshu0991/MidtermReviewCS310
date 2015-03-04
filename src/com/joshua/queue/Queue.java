package com.joshua.queue;

public class Queue<T> implements QueueSpec<T>{

	QNde<T> head = new QNde<T>();
	QNde<T> tail = new QNde<T>();
	
	@Override
	public boolean enqueue(T val) {
		if(head.next == null)
		{
			QNde<T> t = new QNde<T>(val);
			head.next = t;
			tail.prev = t;
			t.next = tail;
			t.prev = head;
			return true;
		}
		QNde<T> t = new QNde<T>(val);
		t.next = head.next;
		head.next.prev = t;
		t.prev = head;
		head.next = t;
		return true;
	}

	@Override
	public T dequeue() {
		tail = tail.prev;
		return tail.data;
	}

}
