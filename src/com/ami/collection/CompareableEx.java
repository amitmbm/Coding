package com.ami.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class pwithoutcmp
{
	String name;
	String companyName;
	String nationality ;
	
	
	public pwithoutcmp(String name, String companyName, String nationality) {
		this.name = name;
		this.companyName = companyName;
		this.nationality = nationality;
	}
}

public class CompareableEx {
	
	public static void main(String args[])
	{
		Person p1 = new Person("Amit","kony.com","Indian");
		Person p2 = new Person("abc","def.com","brazil");
		Person p3 = new Person("xyz", "abc", "uk");
		Person p4 = p1;
		Person p5 = new Person("Amit","kony.com","Indian");
		Person p6 = new Person("abc","kony.com","brazil");
		
		
		
		Set<pwithoutcmp> ptset = new TreeSet<pwithoutcmp>();
		pwithoutcmp pt1 = new pwithoutcmp("Amit","kony.com","Indian");
		pwithoutcmp pt2 = new pwithoutcmp("abc","def.com","brazil");
		ptset.add(pt1);
		ptset.add(pt2);
		
		Set<pwithoutcmp> pset = new HashSet<pwithoutcmp>();
		pset.add(pt1);
		pset.add(pt2);
		
		List<Person> list = new LinkedList<Person>();
		Collections.sort(list);
		
		System.out.println("printing the hash-set without impl will result in runtime error" + pset);
		System.out.println("printing the tree-set without impl comparable will result in runtime error" + ptset);
		
		System.out.println("but using the Collections class which has static methods for the sorting or Array class which also has static methods will throw the compile time error  ");
		
	}

}
