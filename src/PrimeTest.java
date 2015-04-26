
public class PrimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("prime check for 1"+ isPrime(0));

	}
	
	public static boolean isPrime(long n) {
		boolean prime = true;
		for (long i = 3; i <= Math.sqrt(n); i += 2)
			if (n % i == 0) {
				prime = false;
				break;
			}
		if (( n%2 !=0 && prime && n > 2) || n == 2) {
			return true;
		} else {
			return false;
		}
	}


}
