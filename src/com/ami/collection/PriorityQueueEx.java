package com.ami.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(0);
		a.add(100);
		a.add(50);
		
		Queue<Integer> queue = new PriorityQueue<Integer>(a);
		System.out.println("itrator will not gurantee any order");
		Iterator<Integer> it = queue.iterator();
		while(it.hasNext())
			System.out.println("it"+it.next());
		while(!queue.isEmpty())
		{
			System.out.println(queue.remove());
		}
	}

}
