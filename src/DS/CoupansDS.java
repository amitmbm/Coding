package DS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;
public class CoupansDS {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        		
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
         int N = Integer.parseInt(bufferRead.readLine());
		for (int j=0; j<N; j++) {
			int n = Integer.parseInt(bufferRead.readLine());
			int a = Integer.parseInt(bufferRead.readLine());
			int b = Integer.parseInt(bufferRead.readLine());
			Set<Integer> ans = new TreeSet<Integer>();
			
			if (n == 1) System.out.println(0);
			else {
				n--;
				for (int i=0; i<=n; i++)
					ans.add(i * a + (n - i) * b);
				int cnt = 0;
				for (int i : ans) {
					cnt++;
					if 
                        (cnt < ans.size()) System.out.print(i + " ");
					else 
                        System.out.println(i);
				}
			}
		}
		
	}
    
}