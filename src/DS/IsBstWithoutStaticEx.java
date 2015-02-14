package DS;

/**
 * 
 * @author KH1871
 *
 */
class Tree1
{
	int data;
	Tree1 left;
	Tree1 right;
	
	Tree1(int data)
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
public class IsBstWithoutStaticEx {

	//static Tree prev=null;
	public static void main(String args[])
	{
		Tree1 root= new Tree1(10);
		root.left=new Tree1(2);
		root.right=new Tree1(16);
		root.left.left= new Tree1(1);
		root.left.right= new Tree1(6);
		System.out.println(root);
		//IsBst isBst = new IsBst();
		boolean tree=IsBstWithoutStaticEx.IsBstTree(root , Integer.MIN_VALUE , Integer.MAX_VALUE);
		System.out.println("given tree is BST ::"+ tree);
	}
	// this impl is perfect , any other approach might give wrong result
	// like i tried to remove prev and was just comparing root with its left and right , which is not a right app.
	
	public static boolean IsBstTree(Tree1 root , int min , int max)
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
