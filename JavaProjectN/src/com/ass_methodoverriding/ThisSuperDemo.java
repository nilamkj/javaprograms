package com.ass_methodoverriding;


public class ThisSuperDemo {

	public static void main(String[] args) {
		Car1 c=new Car1();
		c.show("I2o","Blue");
		
		Car1 c1=new Car1("Baleno","White");
		
		BMW b=new BMW();
		b.showDetails("Pink",180);
	}

}
