/*
 * verse innovation coding round
 */

/* IMPORTANT: class must not be public. */

/*
 * uncomment this if you want to read input. */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MergeArray {
	public static void main(String args[]) throws Exception {
		/*
		 * Read input from stdin and provide input before running
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		int n[] = new int[N];
		String s = null;
		s = br.readLine();
		String st[] = s.split(" ");
		for (int i = 0; i < N; i++)
			n[i] = Integer.parseInt(st[i]);

		line = br.readLine();
		int M = Integer.parseInt(line);
		int m[] = new int[M];
		s = br.readLine();
		st = s.split(" ");
		for (int i = 0; i < M; i++) {
			m[i] = Integer.parseInt(st[i]);
		}

		int a[] = fnMergeArray(n, m);
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}

	public static int[] fnMergeArray(int n[], int m[]) {
		int arr[] = new int[n.length + m.length];
		int i = n.length - 1;
		int j = m.length - 1;
		int k = i + j + 1;
		
		while (i >= 0 && j >= 0) {
			if (n[i] >= m[j]) {
				arr[k--] = n[i--];
			} else {
				arr[k--] = m[j--];
			}
		}

		while (i >= 0)
			arr[k--] = n[i--];

		while (j >= 0)
			arr[k--] = m[j--];
		// }
		return arr;
	}
}
