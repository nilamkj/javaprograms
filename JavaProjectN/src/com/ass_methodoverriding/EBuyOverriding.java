package com.ass_methodoverriding;
//2) WAP to create class company with method address.
//create class eBay which extends company implement address() differently in eBay class.
//Here the method address ()has been overridden in child class.

class Company
{
	public void address()
	{
		
		System.out.println("Address: Pune ");
	}
}
class EBuy extends Company
{
	@Override
	public void address()
	{  
		System.out.println("Address: Satara ");
	}

}
public class EBuyOverriding {

	public static void main(String[] args) {
		Company c=new Company();
		c.address();
		
		EBuy e=new EBuy();
		e.address();
		
				

	}

}
