/*package DS;

public class TreeFloorFlipkart {

	public static void main(String[] args) {
		Tree3 root= new Tree3(10);
		root.left=new Tree3(2);
		root.right=new Tree3(16);
		root.left.left= new Tree3(1);
		root.left.right= new Tree3(6);
		System.out.println(root);
		//IsBst isBst = new IsBst();
		int floor =TreeFloorFlipkart.getFloor(root, 10);
		System.out.println("given number's floor is ::"+ floor);
	}

	public static int getFloor(Tree3 root , int number )
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
*/