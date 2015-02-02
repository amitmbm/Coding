package com.ami.decorator;

public abstract class Drinks implements Beverages {
   
	String drinkType;
	
	public Drinks(String drinkType) {
		this.drinkType = drinkType;
	}

    public String DrinkType()
    {
    	return drinkType;
    }
}
