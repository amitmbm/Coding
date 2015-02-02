package DS;

/*
 * this is to reverse a Line
 */
public class LineRev {
	
	public static void main(String args[])
	{
		String s1="Amit Khandelwal is here";
		int len=s1.length();
		StringBuffer s2 = new StringBuffer();
		int i=len-1;
		int j=0, k=0;
		while(i>=0)
		{
			while(i >= 0 && s1.charAt(i)!= ' ')
			{
				i--;
			}
			j=i+1;
			i=i-1;
		    
		    while(j< len &&(s1.charAt(j)!= ' ' && s1.charAt(j)!= '\0'))
		    {
		    	s2.append(s1.charAt(j));
		    	j++;
		     }
		    s2.append(' ');
		}
		System.out.println(s2);
	}

}
