package com.ami.collection;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * Asked by deepak jha , give a list as an ip to a function which will break it into two 
 * list one for even and another for odd numbers.
 * now i got the point which he was trying to ask is that using itrator only i can remove the elements 
 * if i try to use the remove method of ll then it will throw the concurrent modification exception.
 * And i understood why he was saying about the modcount.
 * Also i will have to use itrator only if i want to filter out the result as using foreach i cann't use the remove of ll.(v.imp)
 */
public class ArrayListTubora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> ll = new ArrayList<Integer>();
		for(int i=1;i<=10;i++)
			ll.add(i);
		System.out.println(fn(ll));
		System.out.println(ll);
        
	}
	
	public static ArrayList<Integer> fn(ArrayList<Integer> ll)
	{
		Iterator<Integer> it = ll.iterator();
		ArrayList<Integer> even = new ArrayList<Integer>(5);
		//ArrayList<Integer> odd = new ArrayList<Integer>(5);
		while(it.hasNext())
		{ 
			int item= it.next();
			if(item%2==0)
			{
				even.add(item);
				//ll.remove(item); // it will throw concurrent modification exception.
				it.remove();
			}
		}
		return even;
	}

}
