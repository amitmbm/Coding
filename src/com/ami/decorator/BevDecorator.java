/**
 * 
 */
package com.ami.decorator;

/**
 * @author KH1871
 *
 */
public abstract class BevDecorator implements Beverages {

	/**
	 * 
	 */
	Beverages beverages;
	public BevDecorator(Beverages bev) {
		// TODO Auto-generated constructor stub
		beverages=bev;
	}

	/* (non-Javadoc)
	 * @see com.ami.decorator.Beverages#getCost()
	 */
	

}
