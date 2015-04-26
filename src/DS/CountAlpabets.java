package DS;

/*
 * verse innovation coding round
 */
/* IMPORTANT: class must not be public. */

/*
 * uncomment this if you want to read input. */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CountAlpabets {
	public static void main(String args[]) throws Exception {
		/*
		 * Read input from stdin and provide input before running
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int[] array = getAlphabetCount(s);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
			// int N = Integer.parseInt(line);

		}

	}

	public static int[] getAlphabetCount(String s) {
		int[] retCharArray = null;
		if (s.length() > 0) {
			retCharArray = new int[26];
			for (int i = 0; i < s.length(); i++) {
				int a = s.charAt(i);

				a = a - 65;
				if (a >= 0) {
					if (a >= 32) {
						a = a - 32;
					}
					if (a <= 25) {
						retCharArray[a] = retCharArray[a] + 1;
					}
				}
			}

		}
		return retCharArray;
	}
}
