package com.ami.amusementpark;

public interface IActivity {
	
	public float getCost();
	
	public void setCost(float cost);
	
	public void print();
	
	public void performActivity();
	
	public IActivity getCopy();
	
	public String getTypeOfActivity();
	
	public void setTypeOfActivity(String type);
	
	public String getActivityName();
	
	public void setActivityName(String name);
	

}
