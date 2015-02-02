/**
 * 
 */
package com.ami.decorator;

/**
 * @author KH1871
 *
 */
public class Sugar extends BevDecorator {

	/**
	 * @param bev
	 */
	public Sugar(Beverages bev) {
		super(bev);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.ami.decorator.Beverages#getCost()
	 */
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		
	  return super.beverages.getCost() + 0.5;
		
	}

}
