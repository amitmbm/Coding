package DS;

/*
 *  Below code will compact the Array without using any extra space .
 */
public class CompactArray {

	public static void main(String args[]) {
		char[] A = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l' }; //N
		int B[] = { 5, 0, 2 }; // K 
		int i = 0, j = 0;
		// below code will just insert '_' in Array A in O(K).
		for (i = 0; i < B.length; i++) {
			A[B[i]] = '_';
		}

		
		for (i = 0; i < A.length; i++) {
			if (A[i] == '_') {
				j = i + 1;
				/* Below while loop will execute to find the next element is Array which is a valid char and not 
				 the one which we want to remove . Still it is not O(N) solution but considering K<<N , i am 
				 assuming below while loop we can ignore in terms of complexity . , let me know if your suggestion and improvemnets  */
			while (j < A.length && A[j] == '_') {
					j++;
				}
				// below condition will remove the char and place the next valid char.
				if (j < A.length) {
					A[i] = A[j];
					A[j] = '_';
				}

			}
		}

		for (i = 0; i < A.length; i++) {
			System.out.print(A[i]);
		}
	}

}
