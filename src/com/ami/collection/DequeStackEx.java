package com.ami.collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

/*
 * This is a stack example using deque as java-doc
 * says that instead of using stack class use deque to implement stack 
 * Also remember the diff between add and offer function 
 * Also ArrayDeque and linkedqueue is not thread safe.
 */
public class DequeStackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deque<Integer> st = new ArrayDeque<Integer>(2);
		st.addLast(1);
		st.add(20);
		st.add(30);
		
		System.out.println("printing the stack , which will in turn not throw the exception as array is resizable" + st);
		
		System.out.println("below will throw the exception as linkedlist impl is not resizable and it is used to implement a queue");
      
		Deque<Integer> q = new LinkedBlockingDeque<Integer>(2);
		q.offer(1);
		q.offer(20);
		q.offer(30);
		
		System.out.println("printing the queue without exception" + q);
		
		Deque<Integer> qq = new LinkedBlockingDeque<Integer>(1);
		qq.add(1);
		qq.add(2);
		System.out.println("it will throw te exception and it will only be in case of blocking queue" + qq);
		
	}

}
