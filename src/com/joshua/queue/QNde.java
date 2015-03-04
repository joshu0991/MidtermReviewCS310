package com.joshua.queue;

public class QNde<T> {
	QNde(T val){
		data = val;
	}
	QNde(){}
	QNde<T> next = null;
	QNde<T> prev = null;
	T data;
}
