package com.ami.observer;

public class TestObserver {
	
	public static void main(String args[])
	{
		ObserverOne ob1 = new ObserverOne(10);
		ObserverTwo ob2 = new ObserverTwo(20);
		
		Subject sub = new Subject(5);
		System.out.println("before adding the ob");
		System.out.println(ob1.tmp);
		System.out.println("after");
		sub.addObserver(ob1);
		sub.addObserver(ob2);
		sub.notifyUpdate(25);
		sub.deleteObserver(ob1);
		sub.notifyUpdate(45);
		
	}

}
