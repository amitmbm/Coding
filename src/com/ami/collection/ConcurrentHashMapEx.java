package com.ami.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/*
 * concurrent hash-map has the fail-safe itrator , it means it will take the snap-shot of the orignal map
 * and continue to traverse on that , hence any modification will not affect the snapshot , while other itrator
 * are fail-fast as they are working o the orignal and use modcount global variable . 
 */

public class ConcurrentHashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Map<String,String> myMap = new ConcurrentHashMap<String,String>();
        myMap.put("1", "1");
        myMap.put("2", "1");
        myMap.put("3", "1");
        myMap.put("4", "1");
        myMap.put("5", "1");
        myMap.put("6", "1");
        System.out.println("ConcurrentHashMap before iterator: "+myMap);
        Iterator<String> it = myMap.keySet().iterator();
 
        while(it.hasNext()){
            String key = it.next();
           //TODO   it.remove operation ans see whetther it reflects in th original hashmap or not.
            System.out.println("value of mymap using itrator"+ myMap.get(key));
           // if(key.equals("3")) myMap.put(key+"new", "new3");
            myMap.put("7", "7");
        }
        System.out.println("ConcurrentHashMap after iterator: "+myMap);
		
        System.out.println("example which shows that concurrent hashmap doesn't support NULL keys and values");
        Map<String,String> mp = new ConcurrentHashMap<String,String>();
        mp.put("1", null);
        mp.put(null, "1");
        System.out.println("printing null values mp"+mp);
	

	 //HashMap
    myMap = new HashMap<String,String>();
    myMap.put("1", "1");
    myMap.put("2", "1");
    myMap.put("3", "1");
    myMap.put("4", "1");
    myMap.put("5", "1");
    myMap.put("6", "1");
    System.out.println("HashMap before iterator: "+myMap);
    Iterator<String> it1 = myMap.keySet().iterator();

    while(it1.hasNext()){
        String key = it1.next();
        if(key.equals("3")) myMap.put(key, "new3");
    }
    System.out.println("HashMap after iterator: "+myMap);
	}
}
