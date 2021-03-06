package DS;

class EvenRunnable implements Runnable {
	private int number = 2;
	private Object shared = null;

	public EvenRunnable(Object object) {
		shared = object;
	}

	public void run() {
		//if(number)
		while (number < 10) {
			synchronized (shared) {
				System.out.println("Even number =" + number);
				number = number + 2;
				try {
					Thread.sleep(500); // only to view sequence of execution
					shared.notify();
					shared.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}


class OddRunnable implements Runnable {
	int oddNumber = 1;
	private Object shared = null;

	public OddRunnable(Object object) {
		shared = object;
	}

	public void run() {
		while (oddNumber < 10) {
			synchronized (shared) {
				System.out.println("Odd number = " + oddNumber);
				oddNumber = oddNumber + 2;
				try {
					Thread.sleep(500); // only to view the sequence of execution
					shared.notify();
					shared.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}


public class EvenRun {
	public EvenRun() {
	}

	public static void main(String[] args) {
		Object shared = new Object();
		EvenRunnable evenRunnable = new EvenRunnable(shared);
		OddRunnable oddRunnable = new OddRunnable(shared);
		Thread evenThread = new Thread(evenRunnable, "evenThread");
		Thread oddThread = new Thread(oddRunnable, "oddThread");
		evenThread.start();
		try {
			oddThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		oddThread.start();
		
	}
}
