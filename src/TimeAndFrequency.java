import org.testng.annotations.Test;

public class TimeAndFrequency {

	/*
	 * public static void main(String args[]) { long startTime =
	 * System.currentTimeMillis(); long i = -23000000; while (i < 1000000000) {
	 * i++; // sleep(100); } long endTime = System.currentTimeMillis(); long
	 * diff = endTime - startTime; System.out.println("total elasped time is::"
	 * + diff);
	 * 
	 * }
	 */
	@Test(timeOut = 150)
	public void te() {
		long i = -23000000;
		while (i < 1000000000) {
			i++;
			// sleep(100);
		}
	}
}
