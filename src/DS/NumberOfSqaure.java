package DS;

/**
 * 
 * @author KH1871 (Asked in getit interview)
 *
 */
public class NumberOfSqaure {

	
	public static void main(String args[])
	{
		int n=8;
		int no_of_sqaure=fn(n);
		System.out.println("no_of_sqaure" + no_of_sqaure);
	}
	
	public static int fn(int n)
	{
		//int sum=0;
		if(n==1)
			return 1;
		else
		{
			//sum=sum+(n*n);
			return n*n + fn(n-1);
		}
		
	}
}
