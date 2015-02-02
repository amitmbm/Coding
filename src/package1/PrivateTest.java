package package1;

class Private {
	
	private String str;
	private String str_name;
	String nospec;
	
	Private()
	{
		str="str";
		str_name="str_name";
		nospec="nospec";
	}

}

public class PrivateTest
{
	public static void main(String args[])
	{
		Private pri = new Private();
		System.out.println("private var i am printing"+ pri.nospec);
	}
	
}