/*
 * it was quetion asked in adobe or some other company
 */
public final class InnerClassEx {
	class Inner {
		void test() {
			if (InnerClassEx.this.flag)
				;
			{
				sample();
			}
		}
	}

	private boolean flag = true;

	public void sample() {
		System.out.println("Sample");
	}

	public InnerClassEx() {
		(new Inner()).test();
	}

	public static void main(String args[]) {
		new InnerClassEx();
	}
}
