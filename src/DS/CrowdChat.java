package DS;

/* 
 *  this program will print the total no of set bits
 *  in an array. 
 */
public class CrowdChat {

	public static void main(String args[]) {
		int[] arr = { 1, 5, 6, 2, 5 };
		int totalCnt = 0, localCnt = 0, number = 0;
		int i = 0;
		while (i < arr.length) {
			number = arr[i];
			localCnt = 0;
			while (number > 0) {
				// below & operator will work on number and its one less number , this will
				// cause the right most bit of number to Unset and below loop will run
				// no of times set bit present in the number.
				number = number & (number - 1);
				localCnt++;
			}
			totalCnt = totalCnt + localCnt;
			i++;
		}

		System.out.println("total set bits in Array are ::::" + totalCnt);
	}

}
