

public class HelloWorld {

	static int number=1;
	public static void main(String args[])
	{
		 //int number= 20;
		float x=10f;
		
		/* List<Integer> l = new ArrayList<Integer>();
		 l.add(10);
		 List al = l;
		 al.add("Ajssds");
		 HelloWorld h = new HelloWorld();
		 //h.test();
		 System.out.println("return" + h.test());
		 System.out.println("number"+h.number);*/
		 //System.out.println("abc");
		/* if(x==10.0)
			 System.out.println("equals");
		 Assert.assertEquals(number, 25);
		System.out.println("hello world in java");
		System.out.println("value of number is in main method is::"+ number);
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.test();
		System.out.println("value of number is in after function call is::"+ number);
		//test();
		System.out.println("next-1");
		System.out.println("next");*/
	}
	
	public int test()
	{
		try{
			number=number +1;
			return number;
		}
		catch(Exception e)
		{
			return 0;
		}
		finally
		{
			number=number +1;

		}
		
	}
}
