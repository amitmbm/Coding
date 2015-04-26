package DS;

public class TreeNode
{
	int data;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}

	@Override
	public String toString() {
		return "Tree [data=" + data + ", left=" + left + ", right=" + right
				+ "]";
	}
	
	// print the inorder traversal
	public static void printInOrder (TreeNode root)
	{
        if(root == null)
        	return;
        else
		{
        	printInOrder(root.left);
			 System.out.print(": "+ root.data);
			 printInOrder(root.right);
		}
 
			
	}
	
}