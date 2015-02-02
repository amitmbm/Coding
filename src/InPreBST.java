
class Node {
	int data;
	Node left;
	Node right;

	public static Node getNode() {
		Node node = new Node();
		node.left = null;
		node.right = null;
		return node;
	}
}

public class InPreBST extends Node {

	static int in[] = {1,2,3,4,5,6,7,8,9,10};
	static int pre[] = {5,3,2,1,4,8,7,6,9,10};

	public static void main(String args[]) {
		System.out.println("inside the main class");

		Node root = null;
		int in_first = 0, in_last = 9, pre_first = 0;
		root = BST(in_first, in_last, pre_first);
		System.out.println("after constructing the tree--below is the tree");
		fnbst(root);

	}

	public static Node BST(int in_first, int in_last, int pre_first) {

		if (in_last < in_first || pre_first >=10 )
			return null;

		Node root = getNode();
		//if(pre_last <= 7)
		root.data = pre[pre_first];
		//System.out.println(pre_first);
		int i = 0,cnt=0;
		for (i = in_first; i <= in_last; i++) {
			if (pre[pre_first] == in[i])
				break;
			cnt++;
		}
        if(in_first == in_last)
        {
        	root.left=null;
        	root.right=null;
        }
        else
        {
		root.left = BST(in_first, in_first + cnt - 1, pre_first + 1);
		root.right = BST(i + 1, in_last, pre_first + cnt + 1);
       // System.out.println("root->data"+root.data);
        }
		return root;

	}

	public static void fnbst(Node root) {
		if (root == null)
			return;
		fnbst(root.left);
		System.out.println("root->data  ::" + root.data);
		fnbst(root.right);

	}
}
