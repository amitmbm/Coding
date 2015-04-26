package com.ami.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * it will not contain the dup element but at the same time it will not throw any error , if we add duplicate key.
 */

class set
{
	int a;
	public set(int a) {
		this.a=a;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "set [a=" + a + "]";
	}
	
	
	
}

class setwimpl
{
	int a;
	public setwimpl(int a) {
		this.a=a;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "set [a=" + a + "]";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof setwimpl)) {
			return false;
		}
		setwimpl other = (setwimpl) obj;
		if (a != other.a) {
			return false;
		}
		return true;
	}
	
	
	
}

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
		
		Set<set> se = new HashSet<set>();
		se.add(new set(10));
		se.add(new set(10));
		se.add(new set(15));
		se.add(new set(20));
		/*set.add("abc");
		set.add("aaa");*/
		
		System.out.println("printing out the set with custom object , which doesn't impl equals and hashcode" + se);
		
		Set<setwimpl> s = new HashSet<setwimpl>();
		s.add(new setwimpl(10));
		s.add(new setwimpl(10));
		s.add(new setwimpl(15));
		s.add(new setwimpl(20));
		
		System.out.println("printing out the set with custom object , which implements equals and hashcode , hence will not print 10 two times" + s);
		
		Set<String> treeset = new TreeSet<String>();
		treeset.add("abc");
		treeset.add("aaa");
		treeset.add("fgh");
		treeset.add("hdsjkadhka");
		treeset.add("abc");
		treeset.add("aaa");
		
		System.out.println("printing out the tree set , which will print the keys in sorting order " + treeset); 
		
		Set<set> treese = new TreeSet<set>();
		treese.add(new set(10));
		treese.add(new set(10));
		treese.add(new set(15));
		treese.add(new set(20));
		
		//System.out.println("printing out the tree set , which doesn't impl the comapartor , here we will get the runtime error as function add doesn't check compartor or doesnt use genrics " + treese); 
		
		Set<String> llset = new LinkedHashSet<String>();
		llset.add("abc");
		llset.add("aaa");
		llset.add("fgh");
		llset.add("hdsjkadhka");
		llset.add("abc");
		llset.add("aaa");
		
		System.out.println("printing out the linkedhas set , which will print the keys in insertion order " + llset); 
	}
}

