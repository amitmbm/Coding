
class CF
{
   public static CF c=new CF();
   
	/* (non-Javadoc)
	 * @see java.lang.Object#finalize()
	 */
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("coming inside the finalize method");
		c=new CF();
		c=null;
		c=new CF();
		c=null;
		//s=new
		
	}
	
}
public class FinallizeGainSightEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		//CF c = new CF();
		//s=null;
		CF.c=null;
	}

}
