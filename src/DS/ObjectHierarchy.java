package DS;

class first{

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "overrided";
	}
	
}

class second extends first
{
	
}
public class ObjectHierarchy extends first{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      second s= new second();
      System.out.println("printing tostring of s" + s);
	}

}
