package DS;

/**
 * 
 * @author KH1871
 *
 */
class Tree
{
	int data;
	Tree left;
	Tree right;
	
	Tree(int data)
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
	
	
}
public class IsBst {

	static Tree prev=null;
	public static void main(String args[])
	{
		Tree root= new Tree(10);
		root.left=new Tree(2);
		root.right=new Tree(16);
		root.left.left= new Tree(1);
		root.left.right= new Tree(16);
		System.out.println(root);
		//IsBst isBst = new IsBst();
		boolean tree=IsBst.IsBstTree(root);
		System.out.println("given tree is BST ::"+ tree);
	}
	// this impl is perfect , any other approach might give wrong result
	// like i tried to remove prev and was just comparing root with its left and right , which is not a right app.
	
	public static boolean IsBstTree(Tree root)
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
