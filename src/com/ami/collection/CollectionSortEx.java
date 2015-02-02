package com.ami.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSortEx {
	
	public static void main(String args[])
	{

		List<Person> ll = new ArrayList<Person>();
		Person p1 = new Person("Amit","kony.com","Indian");
		Person p2 = new Person("abc","def.com","brazil");
		Person p3 = new Person("xyz", "abc", "uk");
		Person p4 = p1;
		Person p5 = new Person("Amit","kony.com","Indian");
		Person p6 = new Person("abc","kony.com","brazil");
		
		ll.add(p1);
		ll.add(p2);
		
		Collections.sort(ll);
		System.out.println("printing the sorted ll"+ ll);
	}
	
	
	
	
	

}
