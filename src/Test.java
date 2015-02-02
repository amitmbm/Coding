import java.util.ArrayList;
import java.util.List;


public class Test {
	
	public static void main(String args[])
	{
	                 
		String [] dict = {"you","your","an","ran","ra","n"};
		String sent ="youran";
		boolean res = fnTestSentence(dict,sent);
		System.out.println("result is" + res);
		
	}
	
	public static boolean fnTestSentence(String [] dict , String sent)
	{
		int beg=0,cur=1,i=0;
		int length= sent.length();
		List<String> list = new ArrayList<String>();
		String substr =null;
		Boolean result;
		while(cur<=length)
		{
			substr = sent.substring(beg, cur);
			result=fnMatchSubStr(dict,substr);
			if(result == true)
			{
				cur++;
				beg=cur-1;
				list.add(substr);
			}
			else 
			cur++;
		}
		beg=0;
		cur=1;
		while(cur<=length)
		{
			substr = sent.substring(beg, cur);
			result=fnMatchSubStr(dict,substr);
			if(result == true)
			{
				cur++;
				beg=cur-1;
				list.add(substr);
			}
			else 
			cur++;
		}
		System.out.println("content of my list  is " + list);
		return false;
	}
	
	public static boolean fnMatchSubStr(String [] dict , String substr)
	{
		for(String str : dict)
		{
			if(str.equals(substr))
				return true;
		}
		return false;
	}
	

}
