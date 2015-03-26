package com.ami.amusementpark;

class Singleton {

	public static Singleton singleton ;
	
	String msg;
	
	public Singleton()
	{
		this.msg="";
	}
	
	private Singleton(String msg)
	{
		this.msg=msg;
	}
	
	public static Singleton getSingletonInstance(String msg)
	{
		if(singleton == null)
		  singleton= new Singleton(msg);
		return singleton;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Singleton [msg=" + msg + "]";
	}
	
	
}

/* class to create to get the singleton obj */

public class AmusementParkCreation extends Singleton
{
   
	public static void main(String args[])
	{
		Singleton singleton = Singleton.getSingletonInstance("ABC");
		System.out.println("singleton object is" + singleton);
		
		Singleton singleton1 = Singleton.getSingletonInstance("DEF");
		System.out.println("singleton object is" + singleton1);
	}
}
