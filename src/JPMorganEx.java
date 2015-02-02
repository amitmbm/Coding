


 // http://stackoverflow.com/questions/2801878/implementing-two-interfaces-in-a-class-with-same-method-which-interface-method
	
interface ABC
{
	public void dowork();
}

interface DEF
{
	public void dowork();
}

public class JPMorganEx implements ABC , DEF {

	public static void main(String args[])
	{
		System.out.println("testing the try-catch block");
		ABC abc = new JPMorganEx();
		abc.dowork();
		DEF def = new JPMorganEx();
		def.dowork();
	    try{
	    	int a = 5/0;
	    	throw new Exception();
	    }catch(Exception e){
	    	
	    }
	}
	@Override
	public void dowork() {
		// TODO Auto-generated method stub
       System.out.println("dowork");		
	}
	
}
