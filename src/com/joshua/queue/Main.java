package com.joshua.queue;

public class Main {
	public static void main(String [] args){
	Queue<String> t = new Queue<String>();
	t.enqueue("Testing");
	t.enqueue("1");
	t.enqueue("2");
	t.enqueue("3");
	System.out.println("first " + t.dequeue());
	System.out.println("second " + t.dequeue());
	System.out.println("third " + t.dequeue());
	System.out.println("forth " + t.dequeue());
	}
}
