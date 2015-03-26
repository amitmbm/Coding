package com.ami.amusementpark;

public abstract class AbstractActivity implements IActivity {

	
	 protected float cost;
	 protected String activityName;
	 protected String activityType;
	 
	@Override
	public float getCost() {
		// TODO Auto-generated method stub
		return cost;
	}

	@Override
	public void setCost(float cost) {
		// TODO Auto-generated method stub

		this.cost = cost;
	}

	@Override
	public void print() {
      System.out.println(getActivityName()+ ":" + cost + "$");
	}

	@Override
	public void performActivity() {
		// TODO Auto-generated method stub
		System.out.println("performing activity :"+getActivityName());

	}

	@Override
	public IActivity getCopy() {
		// TODO Auto-generated method stub
		try {
			return (IActivity) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
		
	}

	@Override
	public String getTypeOfActivity() {
		// TODO Auto-generated method stub
		return activityType;
	}

	@Override
	public void setTypeOfActivity(String type) {
		// TODO Auto-generated method stub
		this.activityType = type;

	}

	@Override
	public String getActivityName() {
		// TODO Auto-generated method stub
		return activityName;
	}

	@Override
	public void setActivityName(String name) {
		// TODO Auto-generated method stub
		this.activityName = name;

	}

}
