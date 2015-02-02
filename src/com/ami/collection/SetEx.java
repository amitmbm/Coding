package com.ami.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * it will not contain the dup element but at the same time it will not throw any error , if we add duplicate key.
 */
public class SetEx {

	public static void main(String args[])
	{
		Set<String> set = new HashSet<String>();
		set.add("abc");
		set.add("aaa");
		set.add("fgh");
		set.add("hdsjkadhka");
		set.add("abc");
		set.add("aaa");
		
		System.out.println("printing out the set" + set);
		
		Set<String> treeset = new TreeSet<String>();
		treeset.add("abc");
		treeset.add("aaa");
		treeset.add("fgh");
		treeset.add("hdsjkadhka");
		treeset.add("abc");
		treeset.add("aaa");
		
		System.out.println("printing out the tree set , which will print the keys in sorting order " + treeset); 
		
		Set<String> llset = new LinkedHashSet<String>();
		llset.add("abc");
		llset.add("aaa");
		llset.add("fgh");
		llset.add("hdsjkadhka");
		llset.add("abc");
		llset.add("aaa");
		
		System.out.println("printing out the tree set , which will print the keys in sorting order " + llset); 
	}
}

