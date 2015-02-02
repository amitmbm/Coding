package DS;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node {
	String label;
	List<Node> children;
}

public class CeligoTree {

	public static void main(String args[]) {
		/* created a basic tree using the hardcoded values*/
		Node tree = new Node();
		Node child1 = new Node();
		Node child2 = new Node();
		Node child3 = new Node();
		Node child4 = new Node();
		tree.label = "1";
		child1.label = "2";
		child2.label = "3";
		child3.label = "4";
		child4.label = "5";

		tree.children = new LinkedList<Node>();
		tree.children.add(child1);
		tree.children.add(child2);
		tree.children.add(child3);

		child1.children = new LinkedList<Node>();
		child1.children.add(child4);

		child2.children = new LinkedList<Node>();
		child3.children = new LinkedList<Node>();
		child2.children.add(null);
		child3.children.add(null);
		System.out.println("tree root is" + tree.label);

		Queue<Node> q = new LinkedList<Node>();
		q.add(tree);
		Queue<Node> c = new LinkedList<Node>();
		Iterator<Node> it = null;
		/* use of two queue , one for storing the children of current node and 
		 * another to hold all the node , basically Its a BFS traversal using the two queue
		 * As with single queue , we will get the concurrent modification exception
		 */
		while (!q.isEmpty()) {
			Node tmpo = q.remove();
			if (tmpo == null)
				break;
			/*
			 * adding the node in another queue "c" , from where we will print
			 * all the nodes of tree
			 */
			c.add(tmpo);
			if (tmpo.children != null)
				it = tmpo.children.iterator();
			while (it.hasNext())
				q.add(it.next());
		}
		Iterator<Node> ct = c.iterator();
		while (ct.hasNext())
			System.out.println(ct.next().label);
	}
}
