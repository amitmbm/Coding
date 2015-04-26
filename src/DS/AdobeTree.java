package DS;

/*
 * Root to leaft path code , which was aked in adobe written test.
 */

public class AdobeTree 
{
	
	public static void main(String[] args) {
		TreeNode root= new TreeNode(10);
		root.left=new TreeNode(2);
		root.right=new TreeNode(16);
		root.left.left= new TreeNode(1);
		root.left.right= new TreeNode(5);
	        int sum=10;
	     if(AdobeTree.hasPathSum(root, sum))
	    System.out.println("There is a rootNode-to-leaf path with sum::"+sum);
	    else
	   System.out.println("There is no rootNode-to-leaf path with sum::"+ sum);
	}
	
	
    
  public static boolean hasPathSum(TreeNode node, int sum)
{
  if (node == null)
  {
     return (sum == 0);
  }
  
  else
  {
    boolean  ans = false;  
    int subSum = sum - node.data;

     if ( subSum == 0 && node.left == null && node.right == null )
      return true;
  
    if(node.left != null)
      ans = ans || hasPathSum(node.left, subSum);
    if(node.right !=null)
      ans = ans || hasPathSum(node.right, subSum);
    return ans;
  }
}
}