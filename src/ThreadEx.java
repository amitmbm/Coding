

/* 
 * example of anonymous thread and runnable interface
 */
public class ThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Thread thread = new Thread(){
		   @Override
		    public void run(){
		      System.out.println("Thread Running"+ getName());
		    }
		  };

		  thread.start();
        System.out.println("=========below is the example of anonymous runnable thread ============");
        Runnable myRunnable = new Runnable(){
        	@Override
            public void run(){
               System.out.println("Runnable running");
            }
          };


          Thread th = new Thread(myRunnable);
          th.start();
          System.out.println(th.getName());
	}

}
