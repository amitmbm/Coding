
/*
 * sample Tree Node with additional fn
 */
public class TreeNode {

		int data;
		TreeNode left;
		TreeNode right;

		public static TreeNode getNode() {
			TreeNode node = new TreeNode();
			node.left = null;
			node.right = null;
			return node;
		}
		
		
		
		public TreeNode() {
			super();
		}



		public TreeNode(int data) {
			super();
			this.data = data;
		}



		public TreeNode(int data, TreeNode left, TreeNode right) {
			super();
			this.data = data;
			this.left = left;
			this.right = right;
		}



		public static void printInOrder(TreeNode node)
		{
			if(node == null)
				return ;
			printInOrder(node.left);
			System.out.println(" "+node.data);
			printInOrder(node.right);
		}
}
