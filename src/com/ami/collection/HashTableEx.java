package com.ami.collection;

import java.util.Hashtable;
import java.util.Map;

public class HashTableEx {

	public static void main(String args[]) {
		
		Map<String, String> hashtable = new Hashtable<String, String>();
		hashtable.put("1","ABC");
		hashtable.put("2", "XYZ");
		
		for(String s : hashtable.keySet())
		{
			System.out.println("removing element"+s);
			hashtable.put("2","hskSHK");
			
		}
		
		System.out.println("printing complete hashtable" + hashtable);
		System.out.println("printing complete hashtable" + hashtable.get("2"));
	}
}
