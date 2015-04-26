
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=fact(5);
		System.out.println(n);

	}

	private static int fact(int i) {
		// TODO Auto-generated method stub
		if(i==0 || i==1)
			 return 1;
		else
			return i*fact(i-1);
	}


}
