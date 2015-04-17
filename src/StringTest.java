import java.util.HashMap;

class p
{
	int a;
	
	public p(int a)
	{
		this.a=a;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return 1;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof p)) {
			return false;
		}
		p other = (p) obj;
		if (a != other.a) {
			return false;
		}
		return true;
	}
	
}

class q
{
	int b;
	
	public q(int a)
	{
		this.b=a;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
	return 1;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof q)) {
			return false;
		}
		q other = (q) obj;
		if (b != other.b) {
			return false;
		}
		return true;
	}
	
}

public class StringTest {

	public static void main(String args[])
	{
		/*  String s="abc";
		  String s1 = new String("abc");
		  System.out.println(s.equals(s1));
		  System.out.println(s==s1);
		  System.out.println(s.intern()==s1.intern());
		  if(s.isEmpty())
		  System.out.println("inside the if block");
		  else
			  System.out.println("inside the else block");
		  
		  String str = "Amti";
		  System.out.println("printing the hashcode of str"+ str.hashCode());*/
		
		HashMap<Object , String > mp = new HashMap<Object,String>();
		mp.put(new p(1), "abc");
		mp.put(new q(2), "def");
		System.out.println("map"+mp);
	}
}
