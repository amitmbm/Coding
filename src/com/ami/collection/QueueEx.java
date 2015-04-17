package com.ami.collection;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.PriorityBlockingQueue;

/*
 * only in case of priority blocking queue i will get the run-time exception if my class doesn't have comparable or compartor
 * but in case of linked it will not thorw any error.
 */
class que
{
	String q;
	public que(String s) {
		q=s;
	}
}

public class QueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> q = new PriorityBlockingQueue<String>();
		q.add("Amit");
		q.add("satpal");
		q.add("rohit");
		q.add("raghav");
		System.out.println("queue ele are in case of comparable elements in the queue" + q);
		
		Queue<que> qu = new LinkedBlockingDeque<que>();
		qu.add(new que("Amit"));
		qu.add(new que("satpal"));
		qu.add(new que("rohit"));
		qu.add(new que("raghav"));
		
		System.out.println("queue ele are in case of comparable elements are not in the queue" + q);
	}

}
