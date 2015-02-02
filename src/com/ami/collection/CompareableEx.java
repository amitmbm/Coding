package com.ami.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CompareableEx {
	
	public static void main(String args[])
	{
		Person p1 = new Person("Amit","kony.com","Indian");
		Person p2 = new Person("abc","def.com","brazil");
		Person p3 = new Person("xyz", "abc", "uk");
		Person p4 = p1;
		Person p5 = new Person("Amit","kony.com","Indian");
		Person p6 = new Person("abc","kony.com","brazil");
		
		Set<Person> pset = new HashSet<Person>();
		pset.add(p1);
		pset.add(p2);
		pset.add(p3);
		pset.add(p4);
		
		Set<Person> ptset = new TreeSet<Person>();
		ptset.add(p1);
		ptset.add(p2);
		ptset.add(p3);
		
		System.out.println("printing the set" + pset.contains(p6));
		System.out.println("printing the tree-set without impl comparable interface in person class" + ptset);
		
	}

}
