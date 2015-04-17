package com.ami.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapEx {

	public static void main(String args[])
	{
		Map<String , String> sortedmap = new TreeMap<String,String>();
		sortedmap.put("ANIT", "ANIT");
		sortedmap.put("ABC", "DEFD");
		sortedmap.put("DEF", "DEF");
		sortedmap.put("GHI", "GHI");
		
		
		System.out.println("printing the tree map , which will print the order acc to sorted key order" + sortedmap);
		System.out.println("getting a key , which is not present" + sortedmap.get("ANIAT"));
		
		Map<String , String> linkedmap = new LinkedHashMap<String,String>();
		linkedmap.put("ANIT", "ANIT");
		linkedmap.put("ABC", "ABC");
		linkedmap.put("DEF", "DEF");
		linkedmap.put("GHI", "GHI");
		
		Map<String , String> linkedmap1 = new LinkedHashMap<String,String>();
		linkedmap1.put("ANIT", "ANIT");
		linkedmap1.put("ABC", "DEF");
		linkedmap1.put("DEF", "DEF");
		linkedmap1.put("GHI", "GHI");
		
		
		System.out.println("comparing two map"+ linkedmap.equals(sortedmap));
		System.out.println("linked hash map will print in the same order as inserted" + linkedmap);
		
		 Map<Object,String> map = new HashMap<Object,String>();
	      
	      // populate the map
	      map.put("1","TP"); 
	      map.put("2","IS");
	      map.put("3","BEST");
	      map.put("4","an");
	      //System.out.println(map.put("3", "three"));
	      System.out.println(map.put(new String("3"), "four"));
	      
	      
	     // System.out.println("******************* for loop to travel the each element in the hashmap ***************");
	   // more elegant way
	  	/*for (Map.Entry<String, String> entry : map.entrySet()) {
	  		System.out.println("Key : " + entry.getKey() + " Value : "
	  			+ entry.getValue());
	  	}
	      */
	      System.out.println("**********************printing the map which will not gurantee the order##########3" + map);
	      
	      Map<String , Integer> simap = new TreeMap<String, Integer>();
			//sortedmap.put("ANIT", new Integer(0));
	         simap.put("ABC", 6);
	         simap.put("DEF", 7);
	         simap.put("GHI", 8);
	         
	         System.out.println("getting a key , which is not present" + simap.get("ANIT"));		
	         
	         System.out.println("========================example of containes key functionality===================================");
	         
	        System.out.println("getting the key value"+ simap.get("ABC"));
	        System.out.println("========================example of getting the keyset of map ==================================="+simap.keySet());
	}
}
