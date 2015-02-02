
public class TryCatchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j = 5;
		try {
			int i = 1 / 0;

		} catch (Exception e) {
			System.out
					.println("i catched this exception and now proram will not stop and continue to next statement");
		}
		System.out.println("After the catch statement" + j);
	}

}
