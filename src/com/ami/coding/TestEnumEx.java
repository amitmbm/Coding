package com.ami.coding;

enum TestEnum {
	
	SALESFORCE("salesforce"), 
	  PEOPLESOFT("peoplesoft"), 
	  SIEBEL("siebel"), 
	  ENTERPRISEDB("enterprisedb"),
	  LOCAL("local");
	
	private String str;
   private TestEnum(String str) {
		// TODO Auto-generated constructor stub
		this.str=str;
	}
	
	  public String getName() {
		    return str;
		  }

		  public void setName(String name) {
		    this.str = name;
		  }

		  
}


public class TestEnumEx
{
	public static void main(String args[])
	{
		System.out.println("getting the value of force.com enum"+ TestEnum.SALESFORCE.getName());
		TestEnum.SALESFORCE.setName("force.com");
		System.out.println("setting the value of enum force.com to force" + TestEnum.SALESFORCE.getName());
		
		for(TestEnum t : TestEnum.values())
		{
			System.out.println("value is"+t.getName());
		}
		
	}
}