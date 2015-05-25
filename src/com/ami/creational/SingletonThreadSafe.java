package com.ami.creational;

/*
 * it will be the example of double checking and volatile
 */

class singleton
{
	private  volatile static singleton instance ;
	private singleton() {
		// TODO Auto-generated constructor stub
	}
	
	public singleton(int i)
	{
		
	}
	
	public static singleton getInstance()
	{
		if(instance==null)
		{
			synchronized (singleton.class) {
				if(instance == null)
					instance= new singleton();
			}
		}
		return instance;
	}
	
}

public class SingletonThreadSafe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		singleton s = singleton.getInstance();
		System.out.println("printing singleton instance" + s);
		singleton s1 = singleton.getInstance();
		System.out.println("another instance"+s1);

	}

}
