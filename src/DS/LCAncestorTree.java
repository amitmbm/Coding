package DS;

public class LCAncestorTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root= new TreeNode(10);
		root.left=new TreeNode(2);
		root.right=new TreeNode(16);
		root.left.left= new TreeNode(1);
		root.left.right= new TreeNode(16);
		//TreeNode root = TreeNode.getBSTTree();
		System.out.println("printing out the BST"); 
		TreeNode.printInOrder(root);
		
		System.out.println("LCA of 2 and 12 :"+ fnLCAncestor(root, 2, 12));
		System.out.println("LCA is 2 and 5 :"+ fnLCAncestor(root, 2, 5));
		System.out.println("LCA is 2 and 10 :"+ fnLCAncestor(root, 2, 10));
		System.out.println("LCA is 1 and 5 :"+ fnLCAncestor(root, 1, 5));
		System.out.println("*********IMP******* LCA is 1 and -20 :"+ fnLCAncestor(root, 1, -20));
        
	}
	
	public static int fnLCAncestor(TreeNode root , int n1 , int n2)
	{
		if(root == null)
			return -1;
		/* you can combine the below two if condition and return it in else part without having any condition , like i did */
		/*if(root.data == n1 || root.data == n2)
			 return root.data;
		if((root.data > n1 && root.data < n2)|| (root.data > n2 && root.data < n1))
			return root.data;*/
		if(root.data > n1 && root.data > n2 )
			return fnLCAncestor(root.left, n1, n2);
	    if(root.data < n1 && root.data < n2)
			return fnLCAncestor(root.right, n1, n2);
	    return root.data;
	}
	 
}
