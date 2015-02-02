package com.ami.decorator;

public class DecoratorTest {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
        Beverages teawithoutsugar =    new Tea("tea");
        System.out.println("price of tea without sugar is::" + teawithoutsugar.getCost());
        
        Beverages coffeewithoutsugar =    new Coffee("coffee");
        System.out.println("price of tea without sugar is::" + coffeewithoutsugar.getCost());
        
		// TODO Auto-generated method stub
        Beverages teawitsugar =    new Sugar(new Tea("tea"));
        System.out.println("price of tea without sugar is::" + teawitsugar.getCost());
        
        Beverages coffeewithCream =   new Cream( new Coffee("coffee"));
        System.out.println("price of tea without sugar is::" + coffeewithCream.getCost());
        
        Beverages coffeewithCreamAndSugar =   new Sugar(new Cream( new Coffee("coffee")));
        System.out.println("price of coffeewithCreamAndSugar is ::" + coffeewithCreamAndSugar.getCost());
        
        
	}

}
