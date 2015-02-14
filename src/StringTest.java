import bsh.StringUtil;

import com.mysql.jdbc.StringUtils;


public class StringTest {

	public static void main(String args[])
	{
		  String s="";
		  if(s.isEmpty())
		  System.out.println("inside the if block");
		  else
			  System.out.println("inside the else block");
		  
		  String str = "Amti";
		  System.out.println("printing the hashcode of str"+ str.hashCode());
	}
}
