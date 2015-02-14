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
public class TreeFlipkart {

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
		int floor =TreeFlipkart.getFloor(root , 3);
		System.out.println("given number's floor is ::"+ floor);
	}
	// this impl is perfect , any other approach might give wrong result
	// like i tried to remove prev and was just comparing root with its left and right , which is not a right app.
	
	public static int getFloor(Tree1 root , int number)
	{
		int tmp=0;
		if(root!=null)
		{
			if(root.data > number )
			{
				tmp=getFloor(root.left, number);
				if(tmp == -1)
					return root.data;
				else
				{
					if(tmp< number)
						return tmp;
					return root.data;
				}
					
					
			}
			else if(root.data < number){
				tmp=getFloor(root.right, number);
				if(tmp == -1)
					return root.data;
				else
				{
					if(tmp< number)
						return tmp;
					return root.data;
				}
					
			}
			
			else
				return root.data;
		}
		return -1;
	}
}
