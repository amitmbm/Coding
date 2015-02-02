import org.testng.Assert;


public class HelloWorld {

	static int number=20;
	public static void main(String args[])
	{
		 int number= 20;
		 Assert.assertEquals(number, 25);
		System.out.println("hello world in java");
		System.out.println("value of number is in main method is::"+ number);
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.test();
		System.out.println("value of number is in after function call is::"+ number);
		//test();
		System.out.println("next-1");
		System.out.println("next");
	}
	
	public void test()
	{
		number=25;
		System.out.println("value of number is ::"+ number);
	}
}
