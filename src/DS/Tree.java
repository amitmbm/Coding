package DS;

public class Tree
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
	
	public static void print (Tree root)
	{
        if(root == null)
        	return;
        else
		{
			print(root.left);
			 System.out.println(":"+ root.data);
			 print(root.right);
		}
 
			
	}
	
}