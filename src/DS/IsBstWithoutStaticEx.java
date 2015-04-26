package DS;

/**
 * 
 * @author KH1871
 *
 */

public class IsBstWithoutStaticEx {

	//static Tree prev=null;
	public static void main(String args[])
	{
		TreeNode root= new TreeNode(10);
		root.left=new TreeNode(2);
		root.right=new TreeNode(16);
		root.left.left= new TreeNode(1);
		root.left.right= new TreeNode(16);
		System.out.println(root);
		//IsBst isBst = new IsBst();
		boolean tree=IsBstWithoutStaticEx.IsBstTree(root , Integer.MIN_VALUE , Integer.MAX_VALUE);
		System.out.println("given tree is BST ::"+ tree);
	}
	// this impl is perfect , any other approach might give wrong result
	// like i tried to remove prev and was just comparing root with its left and right , which is not a right app.
	
	public static boolean IsBstTree(TreeNode root , int min , int max)
	{
		
		if(root!=null)
		{
			if(root.data > max || root.data < min)
				return false;
		  return IsBstTree(root.left, min , (root.data-1)) && IsBstTree(root.right ,root.data+1 , max);
		}
		return true;
	}
}
