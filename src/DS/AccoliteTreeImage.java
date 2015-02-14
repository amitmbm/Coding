package DS;

public class AccoliteTreeImage {

      
		public static void main(String args[])
		{
			Tree root= new Tree(10);
			root.left=new Tree(2);
			root.right=new Tree(16);
			root.left.left= new Tree(1);
			root.left.right= new Tree(16);
			System.out.println("original tree is below");
			Tree.print(root);
			//IsBst isBst = new IsBst();
			Tree tree=AccoliteTreeImage.fnImage(root);
			System.out.println("image of tree is below");
			Tree.print(tree);
		}

		static Tree fnImage(Tree root)
		{
			if(root == null)
			return null;
			else
			{
				Tree tmp=null;
				tmp=root.left;
				root.left=root.right;
				root.right=tmp;
				fnImage(root.left);
				fnImage(root.right);
				return root;
			}
			
		}
}
