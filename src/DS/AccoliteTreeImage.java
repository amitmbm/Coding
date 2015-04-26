package DS;

/*
 * this is a perfect and working code.
 */
public class AccoliteTreeImage {
      
		public static void main(String args[])
		{
			TreeNode root= new TreeNode(10);
			root.left=new TreeNode(2);
			root.right=new TreeNode(16);
			root.left.left= new TreeNode(1);
			root.left.right= new TreeNode(16);
			System.out.println("original tree is below");
			TreeNode.printInOrder(root);
			//IsBst isBst = new IsBst();
			TreeNode tree=AccoliteTreeImage.fnImage(root);
			System.out.println("image of tree is below");
			TreeNode.printInOrder(root);
		}

		static TreeNode fnImage(TreeNode root)
		{
			if(root!= null)
			{
				TreeNode tmp=null;
				tmp=root.left;
				root.left=root.right;
				root.right=tmp;
				fnImage(root.left);
				fnImage(root.right);
				return root;
			}
			return null;
			
		}
}
