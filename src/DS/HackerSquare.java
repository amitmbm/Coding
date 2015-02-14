package DS;

import java.io.*;

public class HackerSquare {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		try {

			BufferedReader bufferRead = new BufferedReader(
					new InputStreamReader(System.in));
			String arr[] = bufferRead.readLine().split(" ");
			int N = Integer.parseInt(arr[0]);
			int s[][] = new int[N][2];
			int cnt = 0;
			for (int i = 0; i < N; i++) {
				arr = bufferRead.readLine().split(" ");
				s[i][0] = Integer.parseInt(arr[0]);
				s[i][1] = Integer.parseInt(arr[1]);
				cnt = 0;
				int low = (int) Math.ceil(Math.sqrt(s[i][0]));
				int high = (int) Math.floor(Math.sqrt(s[i][1]));
				while (low <= high) {
					if ((low * low == s[i][0])) {
						cnt++;
						low++;
					}

					else if ((low * low > s[i][0]) && (low * low <= s[i][1])) {
						cnt++;
						low++;
					} else
						low++;
				}
				System.out.println(cnt);
				// System.out.println(":"+s[i][0]+"va"+s[i][1]);
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}