package DS;

/**
 * 
 * @author KH1871
 *
 */

public class IsBst {

	static TreeNode prev=null;
	public static void main(String args[])
	{
		TreeNode root= new TreeNode(10);
		root.left=new TreeNode(2);
		root.right=new TreeNode(16);
		root.left.left= new TreeNode(1);
		root.left.right= new TreeNode(16);
		System.out.println(root);
		//IsBst isBst = new IsBst();
		boolean tree=IsBst.IsBstTree(root);
		System.out.println("given tree is BST ::"+ tree);
	}
	// this impl is perfect , any other approach might give wrong result
	// like i tried to remove prev and was just comparing root with its left and right , which is not a right app.
	
	public static boolean IsBstTree(TreeNode root)
	{
		
		if(root!=null)
		{
			if(!IsBstTree(root.left))
				return false;
			if(prev!=null && root.data < prev.data)
				return false;
			prev=root;
			if(!IsBstTree(root.right))
				return false;
		}
		return true;
	}
}
