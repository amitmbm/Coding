package DS;

public class KnowlarityPS {
	
	public static void main(String args[])
	{
		int number = fncal(0,3);
		System.out.println("total no of ways by taking either 1 or 2 steps are ::"+ number);
		
		
	}

	static int fncal(int start , int end)
	{
		if(end == 0 || end ==1)
			return 1;
		return fncal(start,end-1) + fncal(start,end-2);
	}
}
