/**
 * 
 */
package com.ami.decorator;

/**
 * @author KH1871
 *
 */
public class Tea extends Drinks {

	/**
	 * @param drinkType
	 */
	public Tea(String drinkType) {
		super(drinkType);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 1.0;
	}

	
}
