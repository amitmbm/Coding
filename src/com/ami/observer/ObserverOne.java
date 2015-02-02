package com.ami.observer;

public class ObserverOne implements Observer {

	
	public int tmp;
	
	public ObserverOne(int t) {
		// TODO Auto-generated constructor stub
		tmp=t;
	}
	@Override
	public void update(int tmp) {
		// TODO Auto-generated method stub
		this.tmp=tmp;
       System.out.println("updating the temp to " + tmp);
	}

}
