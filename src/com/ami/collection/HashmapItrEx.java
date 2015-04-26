package com.ami.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
 * shows diff ways to itrate over hashmap according to your need
 */
public class HashmapItrEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,String> mp = new HashMap<String, String>();
		mp.put("1","Amit");
		mp.put("2","Guddu");
		mp.put("3","chutka");
		mp.put("4","gudda");
	
		System.out.println("if i need to print both key and values");
		
		for(Map.Entry<String,String> e : mp.entrySet()){
			System.out.println("key: "+ e.getKey()+" value: "+e.getValue());
			
		}
			
        System.out.println("below will show the example of removing the ele using the itrator but we will use entryset only");
        
        Iterator<Map.Entry<String, String>> it = mp.entrySet().iterator();
        while(it.hasNext())
        {
        	Map.Entry<String,String> e = it.next();
        	System.out.println("key: "+ e.getKey()+" value: "+e.getValue());
        	it.remove();
        }
        
        System.out.println("printing the map after removing all entries" + mp);
        
        
	}

}
