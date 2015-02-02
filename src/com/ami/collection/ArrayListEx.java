package com.ami.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		
		int a[]={10,2,3,4};
        List<int[]> num = Arrays.asList(a);
        LinkedList<String> list = new LinkedList<String>();
        list.add("abc");
        list.add("def");
        ArrayList<String> array= new ArrayList<String>();
        array.add("abc");
        array.add("def");
        array.add("abc");
        array.add("def");
        System.out.println("======foreach example which is the now substitute for the itrator=====");
        for(String s : array)
        	System.out.println("value of the item is::" + s);
        System.out.println("====== loop completed =======");
       // array.add(null);
        Collections.reverse(array);
        Collections.sort(array);
        System.out.println("printing the sorted array as collection" + array);
        System.out.println("we can access linkedlist element also in a random way" + list.get(1));
        Collection<String> lis1t=null;
        //System.out.println(array.remove(6));
        
        Arrays.sort(a);
      //  System.out.println("list is" + );
		
	}

}
