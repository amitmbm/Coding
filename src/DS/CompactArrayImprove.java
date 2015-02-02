package DS;

public class CompactArrayImprove {
	
	public static void main(String args[]) {
		char[] A = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l' }; //N
		int B[] = { 1, 0, 2 }; // K 
		int i = 0, j = 0;
		// below code will just insert '_' in Array A in O(K).
		for (i = 0; i < B.length; i++) {
			A[B[i]] = '_';
		}

		// Just replace the the char with pos. j with pos i , when i is not equal to '_'.
		// i will take the current index and j will take the position where new char will come.
		for (i = 0; i < A.length; i++) {
			if(A[i]!='_')
			{
				A[j]=A[i];
				j++;
			}
		}
        while(j< A.length)
        {
        	A[j++]='_';
        	
        }
		for (i = 0; i < A.length; i++) {
			System.out.print(A[i]);
		}
	}


}
