

class MyThread extends Thread
{
	int no_of_thread;
	int count_limit;
	String threadName;
	int cnt=1;
	
	public MyThread(int no_of_thread, int count_limit, String threadName) {
		super();
		this.no_of_thread = no_of_thread;
		this.count_limit = count_limit;
		this.threadName = threadName;
	}

	
	/**
	 * @return the threadName
	 */
	public String getThreadName() {
		return threadName;
	}


	/**
	 * @param threadName the threadName to set
	 */
	public void setThreadName(String threadName) {
		this.threadName = threadName;
	}


	public  void run()
	{
		synchronized (this) {
			if(cnt < count_limit)
			{
				if((cnt ==1 && this.getThreadName().equals("t1")) || (count_limit%cnt == 1 && cnt!=1))
				{
					System.out.println("thread" + this.getThreadName()+  "is printing" + cnt);
					cnt++;
					this.notifyAll();
					/*try {
						
						//this.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}*/
					
				}
				else if(cnt ==1 && !this.getThreadName().equals("t1"))
				{
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else
				{
					System.out.println("thread t2 is printing" + cnt);
					cnt++;
				}
			}
		}
	}
}
public class VmwareThread {

	public static void main(String[] args) {
      MyThread t1 = new MyThread(2, 10, "t1");
      MyThread t2 = new MyThread(2, 10, "t2");
      t1.start();
      t2.start();
	}

}
