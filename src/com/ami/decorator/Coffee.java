/**
 * 
 */
package com.ami.decorator;

/**
 * @author KH1871
 *
 */
public class Coffee extends Drinks {

	/**
	 * @param drinkType
	 */
	public Coffee(String drinkType) {
		super(drinkType);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.ami.decorator.Beverages#getCost()
	 */
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 1.5;
	}

}
