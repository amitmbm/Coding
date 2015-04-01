public class PowerFn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("pow"+pow(4,15));
	}

	static int pow(int a, int b) {
		if (b == 0){
			System.out.println("in 0");
			return 1;
		}
			
		if (b == 1)
		{
			System.out.println("in 1");
			return a;
		}
			
		if (b == 2)
		{
			System.out.println("in 2");
			return a * a;
			
		}
			
		if (b == 3)
		{
			System.out.println("in 3");
			return a * a * a;
		}
			

		int divider = 0;
		int res = 0;
		if (b % 2 == 0) {
			System.out.println("in divide by 2");
			divider = 2;
			res = b / divider;
			return pow(pow(a, res), divider);
		} else if (b % 3 == 0) {
			System.out.println("in divide by 3");
			divider = 3;
			res = b / divider;
			return pow(pow(a, res), divider);
		} else {
			System.out.println("in else part");
			// it means that b which we got is a prime number.
			//int reminder = b % 2;
			divider = 2;
			res = b / divider;
			return pow(pow(a, res), divider)*2;
		}

	}
}
