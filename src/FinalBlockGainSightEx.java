
public class FinalBlockGainSightEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int a = f();
		System.out.println("return value is" + a);
	}
	
	public static int f()
	{
		
		try {
			if(1/0 == 0)
				System.out.println("ex");
		} catch (Exception e) {
			System.out.println("in catch exception block");
			return -1;
		}
		finally{
			return -2;
		}
	}

}
