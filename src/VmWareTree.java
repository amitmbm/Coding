//import DS.TreeNode;

//printing kth max element in the tree

public class VmWareTree {

	
	static int k=2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode root= new TreeNode(10);
		root.left=new TreeNode(2);
		root.right=new TreeNode(16);
		root.left.left= new TreeNode(1);
		root.left.right= new TreeNode(5);
		System.out.println("printing in-order");
		TreeNode.printInOrder(root);
		System.out.println("printing kth max");
		TreeNode res=fnPrintKthMaxElement(root);
		System.out.println("data is"+ res.data);
        
	}

	public static TreeNode fnPrintKthMaxElement(TreeNode node)
	{
		if(node == null)
			return null;
		
	
		TreeNode res=fnPrintKthMaxElement(node.right);
		if(res!=null)
			return res;
		k--;
		if(k==0 && node!=null)
			//System.out.println("printing kth max ele" + node.data);
			return node;
		
	    return fnPrintKthMaxElement(node.left);
	}
}
