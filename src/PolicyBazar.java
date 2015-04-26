/* IMPORTANT: class must not be public. */

/*
 * passed this code with 100 % tests and it was on hacker-earth
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PolicyBazar {
	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		String s = null;
		int arr[] = new int[26];
		for (int i = 0; i < N; i++) {
			s = br.readLine();
			System.out.println("before calc");
			for (int j = 0; j < 26; j++) 
				System.out.print(" "+arr[j]);
			for (int j = 0; j < s.length(); j++) {
				int k = s.charAt(j) - 'a';
				arr[k] = arr[k] + 1;
			}
			System.out.println("After calc");
			for (int j = 0; j < 26; j++) 
				System.out.print(" "+arr[j]);
			int cnt = 0, flag = 0;
			for (int j = 0; j < 26; j++) {
				if (arr[j]!=0 && !isPrime(arr[j])) {
					flag = 1;
					break;
				} else if(arr[j]!=0)
					cnt++;
			}
			if (!isPrime(cnt) || flag == 1)
				System.out.println("NO");
			else
				System.out.println("YES");
			for (int j = 0; j < 26; j++) 
				arr[j] = 0;

		}

	}

	public static boolean isPrime(int n) {
		boolean prime = true;
		for (long i = 3; i <= Math.sqrt(n); i += 2)
			if (n % i == 0) {
				prime = false;
				break;
			}
		if ((n % 2 != 0 && prime && n > 2) || n == 2) {
			return true;
		} else {
			return false;
		}
	}
}
