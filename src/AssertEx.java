import org.testng.Assert;


public class AssertEx {
	
	public static void main(String args[])
	{
		testAssert();
		print();
	}

	/**
	 * 
	 */
//	@Test(description="testing of assertion")
	public static void testAssert() {
		int a=5,b=5;
		System.out.println("below my assertion will be executed");
		Assert.assertEquals(a, b,"A AND B MUST BE EQUAL");
	}
    
	public static void print()
	{
		System.out.println("i am inside the print function");
	}
}
