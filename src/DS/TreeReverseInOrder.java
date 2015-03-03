package DS;

/*
 * This is a perfect code in logn time complexity
 */

class Tree3
{
	int data;
	Tree3 left;
	Tree3 right;
	
	Tree3(int data)
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
public class TreeReverseInOrder {

	//static Tree prev=null;
	public static void main(String args[])
	{
		Tree3 root= new Tree3(10);
		root.left=new Tree3(2);
		root.right=new Tree3(16);
		root.left.left= new Tree3(1);
		root.left.right= new Tree3(6);
		System.out.println(root);
		//IsBst isBst = new IsBst();
		int floor =TreeReverseInOrder.getFloor(root , 3);
		System.out.println("given number's floor is ::"+ floor);
	}
	
/*	static int getFloor(Tree3 root , int  item)
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
		
	}*/
	
	static void getFloor(Tree3 root, int k, int &flag, int &ans){
		if(!root)
			return ;
//		if(k>root->data);
			f(root->right,k, flag,ans);
		if(flag!=-1 && (flag==1 || k>root->data)){
			ans = root->data;
			flag=-1;
			return;
		}

		if(root->data==k)
			flag=1;

		f(root->left,k, flag,ans);
	}
}
