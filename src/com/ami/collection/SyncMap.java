package com.ami.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SyncMap {
   public static void main(String[] args) {
      // create map
      Map<String,String> map = new HashMap<String,String>();
      
      // populate the map
      map.put("1","TP"); 
      map.put("2","IS");
      map.put("3","BEST");
      map.put("4","an");
      
      System.out.println("printing the map which will not gurantee the order" + map);
      // create a synchronized map
      Map<String,String> synmap = Collections.synchronizedMap(map);
     
      System.out.println("Synchronized map is :"+synmap);
      
      System.out.println("first element of hashmap is"+ map.get("1"));
   }
}