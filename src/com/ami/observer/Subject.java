package com.ami.observer;

import java.util.ArrayList;

/*
 * This is a class which will hold all the observer of the Application and notify them 
 * when any changes made to this class.
 */

public class Subject {

	int temp;
	ArrayList <Observer> oblist;
	
	public Subject(int t)
	{
		temp = t;
		oblist = new ArrayList<Observer>();
	}
	void addObserver(Observer ob)
	{
		oblist.add(ob);
	}
	
	String deleteObserver(Observer ob)
	{
		oblist.remove(ob);
		return "given observer is deleted";
	}
	
	public void notifyUpdate(int tmp)
	{
		for(Observer ob : oblist)
		{
			ob.update(tmp);
		}
	}
}
