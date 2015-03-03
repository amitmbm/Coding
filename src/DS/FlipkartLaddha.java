package DS;

/*
 * This is a perfect code in logn time complexity
 */

class Tree2
{
	int data;
	Tree2 left;
	Tree2 right;
	
	Tree2(int data)
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
public class FlipkartLaddha {

	//static Tree prev=null;
	public static void main(String args[])
	{
		Tree2 root= new Tree2(10);
		root.left=new Tree2(2);
		root.right=new Tree2(16);
		root.left.left= new Tree2(1);
		root.left.right= new Tree2(6);
		System.out.println(root);
		//IsBst isBst = new IsBst();
		int floor =FlipkartLaddha.getFloor(root , 3);
		System.out.println("given number's floor is ::"+ floor);
	}
	
	static int getFloor(Tree2 root , int  item)
	{
		if(root == null)
			return Integer.MIN_VALUE;
		int l;
		if(item <= root.data)
			l = getFloor(root.left,item);
		else
			l = getFloor(root.right,item);
		if(root.data < item && root.data > l)
			return root.data;
		return l;
		
	}
}
