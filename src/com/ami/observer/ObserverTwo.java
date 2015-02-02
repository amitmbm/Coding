package com.ami.observer;

public class ObserverTwo implements Observer {

	
	int tmp;
	
	public ObserverTwo(int t) {
		// TODO Auto-generated constructor stub
		tmp=t;
	}
	@Override
	public void update(int tmp) {
		// TODO Auto-generated method stub
		this.tmp=tmp;
       System.out.println("updating the temp of OB 2 to " + tmp);
	}

}
