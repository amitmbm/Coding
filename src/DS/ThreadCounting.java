package DS;

class counter 
{
	int cnt;
	public counter()
	{
		this.cnt=1;
	}
	
	public void inc()
	{
		this.cnt = this.cnt+1;
	}

	/**
	 * @return the cnt
	 */
	public int getCnt() {
		return cnt;
	}

	/**
	 * @param cnt the cnt to set
	 */
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	
}
class EvenRunn implements Runnable {
	private int number = 2;
	//private Object shared = null;
	private counter shared = null;

	public EvenRunn(counter cnt) {
		shared = cnt;
	}

	public void run() {
		//if(number)
		while (number < 10) {
			synchronized (shared) {
				if(shared.getCnt()==1)
				{
					try {
						shared.wait();
						shared.notifyAll();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else
				{
					System.out.println("getcnt" + shared.getCnt());
					System.out.println("Even number ====" + number);
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
}


class OddRun implements Runnable {
	int oddNumber = 1;
	private counter shared = null;

	public OddRun(counter cnt) {
		shared = cnt;
	}

	public void run() {
		while (oddNumber < 10) {
			synchronized (shared) {
				//if(shared.getCnt()==)
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


public class ThreadCounting {
	public ThreadCounting() {
	}

	public static void main(String[] args) {
		//Object shared = new Object();
		counter shared = new counter();
		EvenRunnable evenRunnable = new EvenRunnable(shared);
		OddRunnable oddRunnable = new OddRunnable(shared);
		Thread evenThread = new Thread(evenRunnable, "evenThread");
		Thread oddThread = new Thread(oddRunnable, "oddThread");
		evenThread.start();
		/*try {
			oddThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		oddThread.start();
		
	}
}

