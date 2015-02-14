package com.ami.exception;

public class NumberFormatEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "+10";
		char [] arr = {'+','1','1','1','\0'};
		String s = new String(arr);
		//s = s+"\0";
		System.out.println("converting the char array to str resulting:"+s);
		try
		{
			int num = Integer.parseInt(s);
			System.out.println("given number is"+ num);
		}
		catch (NumberFormatException ne)
		{
			ne.printStackTrace();
		}
		
 
	}

}
