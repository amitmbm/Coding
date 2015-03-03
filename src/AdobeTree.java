package DS;

 class Tree1
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

}

public class AdobeTree 
{
        Tree1 root= new Tree1(10);
		root.left=new Tree1(2);
		root.right=new Tree1(16);
		root.left.left= new Tree1(1);
		root.left.right= new Tree1(6);
        
     if(Test.hasPathSum(root, sum))
    System.out.println("There is a root-to-leaf path with sum::"+sum);
    else
   System.out.println("There is no root-to-leaf path with sum::"+ sum);
    
  public static boolean hasPathSum(Tree node, int sum)
{
  if (node == NULL)
  {
     return (sum == 0);
  }
  
  else
  {
    boolean  ans = 0;  
    int subSum = sum - node.data;

     if ( subSum == 0 && nod.left == NULL && node.right == NULL )
      return 1;
  
    if(node.left)
      ans = ans || hasPathSum(node.left, subSum);
    if(node->right)
      ans = ans || hasPathSum(node.right, subSum);
    return ans;
  }
}
}