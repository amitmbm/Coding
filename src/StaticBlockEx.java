
public class StaticBlockEx {
    static String str1;
    String str;
	static{
		
		 str1="Amit";
	}
	
	public static void main(String args[])
	{
		System.out.println("inside the Main fn , Str is::"+ str1);
	StaticBlockEx blockEx= new StaticBlockEx();
	blockEx.print();
		
	}

	public void print()
	{
		System.out.println("str is"+ str);
	}
}

