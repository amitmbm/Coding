
public class ThreadJoinEx {

	public static boolean interrupttask = false;
	
	class Mytask extends Thread
	{
		@Override
		public void run()
		{
			while(!interrupttask)
			{
				//System.out.println("a");
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ThreadJoinEx tj = new ThreadJoinEx();
        Thread t = tj.new Mytask();
        t.start();
        
       Thread.sleep(500);
        
        interrupttask=true;
        
       // t.join();
        System.out.println("abd");
	}

}
