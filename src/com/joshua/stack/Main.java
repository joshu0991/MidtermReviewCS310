package com.joshua.stack;
public class Main {
	public static void main(String args[]){
	StackImpl<String> s = new StackImpl<String>();
	StackImpl<Integer> i = new StackImpl<Integer>();
	s.push("!!!");
	s.push("World");
	s.push("Hello");
	i.push(2);
	i.push(3);
	i.push(4);
	System.out.println("From peek top is " + s.peek());
	System.out.println("From peek top is " + i.peek());
	System.out.println(s.pop().data);
	System.out.println(s.pop().data);
	System.out.println(s.pop().data);
	System.out.println(i.pop().data);
	System.out.println(i.pop().data);
	System.out.println(i.pop().data);
	}
}
