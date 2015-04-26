
/*
 * code of verse innovation
 */
public class ExceptionCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try { int x = 0; int y = 5 / x; } 
		catch (Exception e) { System.out.println("Exception"); } 
		catch (ArithmeticException ae) { System.out.println("Arithmetic Ex"); } 
		System.out.println("finished");

	}

}
