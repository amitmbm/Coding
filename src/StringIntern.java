
public class StringIntern {
	
	public static void main(String args[])
	{
		String s= new String("Amit");
		String s2="amit";
		String s1 = s2.intern();
		System.out.println("checking both the str equal or not"+ (s2==s1));
	}

}
