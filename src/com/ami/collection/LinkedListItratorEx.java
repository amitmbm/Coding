package com.ami.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListItratorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i=1;i<=10;i++)
			a.add(i);
		LinkedList<Integer> ll = new LinkedList<Integer>();
		for(int i=1;i<=10;i++)
			ll.add(i);
      // below is the example of listitrator which offers traversal in previous direction as well 
		//and obtain the current position of the iterator. and be careful , as you have to use interfact ListItrator not itrator.
		
		//Iterator<Integer> it = ll.listIterator(0);
		ListIterator<Integer> it = a.listIterator(5);
		while(it.hasPrevious())
		{
			System.out.println("index"+it.previousIndex());
			System.out.println(""+it.previous());
			
		}
			
	}

}
