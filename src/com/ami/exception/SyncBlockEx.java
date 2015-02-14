package com.ami.exception;

public class SyncBlockEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       SyncBlockEx syncBlockEx = new SyncBlockEx();
       syncBlockEx.fn2();
		
	}

	public synchronized void fn1()
	{
	     System.out.println("inside the f1 and notify can't come inside a static fn , as notify is a non-static fn and it can't "
	     		+ "come from the static fn");
	     notify();
	}
	
	public  void fn2()
	{
	     System.out.println("this fn will thow illegalmonitor state exception");
	     notify();
	}
	
	public static void f3()
	{
		synchronized (SyncBlockEx.class) {
			System.out.println("sync block inside a static fn , hence .class must come");
		}
	}
	
	public  void f4()
	{
		synchronized (this) {
			System.out.println("sync block inside a instance fn , hence this must come");
		}
	}
}
