package DS;

public class TreeFloorFlipkart {

	public static void main(String[] args) {
		Tree1 root= new Tree1(10);
		root.left=new Tree1(2);
		root.right=new Tree1(16);
		root.left.left= new Tree1(1);
		root.left.right= new Tree1(6);
		System.out.println(root);
		//IsBst isBst = new IsBst();
		int floor =TreeFloorFlipkart.getFloor(root, 10);
		System.out.println("given number's floor is ::"+ floor);
	}

	public static int getFloor(Tree1 root , int number )
	{
	
		if(root!=null )
		{
			 getFloor(root.right , number);
			  if(number == root.data)
				  return getFloor(root.left , number);
			  else 
			   getFloor(root.left , number);
			
		}
		return number;
	}
}
