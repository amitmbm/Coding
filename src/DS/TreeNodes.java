/*package org.ami.java;

import java.util.*;

class Node{
	String label;
	List<Node> children;
}

public class TreeNodes {

	public static void main(String args[])
	{
		Node tree = new Node();
		Node child1 = new Node();
		Node child2 = new Node();
		Node child3 = new Node();
		tree.label="1";
		child1.label="2";
		child2.label="3";
		child3.label="4";
		
		/* 2nd level */
		Node child4 = new Node();
		Node child5 = new Node();
		Node child6 = new Node();
		//tree.label="1";
		child4.label="5";
		child5.label="6";
		child6.label="7";
		//
		
		tree.children = new LinkedList<Node>();
		tree.children.add(child1);
		tree.children.add(child2);
		tree.children.add(child3);
		
		child1.children = new LinkedList<Node>();
		child1.children.add(child4);
		
		child3.children = new LinkedList<Node>();
		child3.children.add(child5);
		child3.children.add(child6);
		
		//child1.children = new LinkedList<Node>();
		child2.children = new LinkedList<Node>();
		//child3.children = new LinkedList<Node>();
		//child1.children.add(null);
		child2.children.add(null);
		//child3.children.add(null);
		System.out.println("tree root is"+tree.label);
		
		//ListIterator<LinkedList> it = tree.children.iterator();
		Queue<Node> q = new LinkedList<Node>();
		q.add(tree);
		Queue<Node> c = new LinkedList<Node>(q);
		//Iterator<Node> ct = c.iterator();
		Iterator<Node> qt = q.iterator();
		Iterator<Node> it = tree.children.iterator();
		while(!q.isEmpty())
		{
			Node tmpo = q.remove();
			
			if(tmpo==null)
				break;
			else
				System.out.println("node is"+tmpo.label);
			 c.add(tmpo);
			 if(tmpo.children!=null){
		        it = tmpo.children.iterator();
		while(it.hasNext())
		{
		 //System.out.println("tree children are"+ it.next().label);
		 q.add(it.next());
		
		}
			 }
			 else
			 {
				 q.add(tmpo);
			 }
		}
		/*while(it.hasNext())
		{
		 //System.out.println("tree children are"+ it.next().label);
		 q.add(it.next());
		}*/
		
		System.out.println("data of queue is below");
		Iterator<Node> ct = c.iterator();
		while(ct.hasNext())
		{
		 System.out.println(ct.next().label);
		// q.add(it.next());
		}
		
	/*	System.out.println("tree children are"+tree.child);
		Queue q = new LinkedList();
		q.add(1);
		q.add(2); */
	}
}
*/