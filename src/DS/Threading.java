package DS;

public class Threading {
	public static void main(String args[])
	{
		MyThread mt = new MyThread();
		Thread th = new Thread(mt);
		mt.start();
	}

}
