import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*
 *  test case for snapdeal solution
 *  snapdealmobile
 *  snap , deal , mobile , snapdeal 
 *  and answer will be snap deal mobile
 *  cause snap and deal will come before snapdeal in dictionary hence lexi it is small.
 */

public class SnapdealSolution {

	public static void f(int dp[], int n, int k, String s) {
		if (dp[k] == 0) {
			System.out.print(s.substring(0, k + 1) + " ");
			return;
		}
		f(dp, n, dp[k], s);
		System.out.print(s.substring(dp[k] + 1, k + 1) + " ");
	}

	public static void main(String args[]) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */

		BufferedReader bufferRead = new BufferedReader(new InputStreamReader(
				System.in));
		String str = bufferRead.readLine();
		int N = Integer.parseInt(str);
		String arr[] = new String[N];
		// building a given dictionary
		Map<String, Boolean> dict = new HashMap<String, Boolean>();
		for (int i = 0; i < N; i++) {
			// arr[i]= bufferRead.readLine();
			dict.put(bufferRead.readLine(), true);
			// System.out.println(arr[i]);
		}
		// query or word which we need to search
		String query = bufferRead.readLine();
		int n = query.length();
		int dp[] = new int[n];
		if (query.length() <= 500) {
			for (int i = 0; i < n; i++)
				dp[i] = -1;
			if (dict.containsKey(query.substring(0, 1)))
				dp[0] = -1;
			for (int i = 0; i < n; i++) {
				if (dict.containsKey(query.substring(0, i + 1)))
					dp[i] = 0;
				for (int j = 0; j < i; j++) {
					if ((dp[j] != -1)
							&& dict.containsKey(query.substring(j + 1, i + 1))) {
						dp[i] = j;
						break;
					}
				}
			}
			if (dp[n - 1] == -1) {
				System.out.println("NULL");

			} else {
				f(dp, n, dp[n - 1], query);
				System.out.print(query.substring(dp[n - 1] + 1, n));
			}
		} else {
			System.out.println("NULL");
		}

	}
}