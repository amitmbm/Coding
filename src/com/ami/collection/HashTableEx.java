package com.ami.collection;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

/*
 * hashtable superclass is dictionary which is obsolete from 1.7 and performance wise also
 * it is not comparable to concurrenthashmap or synchronized hash-map.
 * 1. not allows null key and value
 * 2. even get or read function is also sync.
 */

public class HashTableEx {

	public static void main(String args[]) {
		
		Map<String, String> hashtable = new Hashtable<String, String>();
		hashtable.put("1","ABC");
		hashtable.put("2", "XYZ");
		
		Iterator<String> it = hashtable.keySet().iterator();
		System.out.println("using the itrator of hash-table");
		while(it.hasNext())
		{
			System.out.println(" "+it.next());
			it.remove();
		}
			
		for(String s : hashtable.keySet())
		{
			System.out.println("removing element"+s);
			hashtable.put("2","hskSHK");
			
		}
		
		System.out.println("printing complete hashtable" + hashtable);
		System.out.println("printing complete hashtable" + hashtable.get("2"));
	}
}
