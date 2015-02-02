package DS;


public class MyThread extends Thread
{
	public void run()
	{
		System.out.println("inside the thread of Thread class"+Thread.currentThread().getName());
	}
}