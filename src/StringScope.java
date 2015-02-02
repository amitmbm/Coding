import org.testng.annotations.Test;


public class StringScope {

	public int number=10;
	
	@Test
	public void test1()
	{
		System.out.println("value of number befor assignment is:"+ number);
		number=235;
		System.out.println("after number is"+ number);
	}
	@Test
	public void test2()
	{
		System.out.println("inside the test2 ::"+ number);
	}
}
