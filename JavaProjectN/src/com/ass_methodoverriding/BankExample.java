package com.ass_methodoverriding;

//6) A bank has a principal amount and a rate of interest which is 2%. A savings account has 
//a rate of interest 3% while a current account has 5%.Write a method that displays the rate of
//interest based on whether the account is default/ savings/ current.

class Bank
{
	double principle_amt=5000;
	//double rateOfInterest;
	
	public void display()
	{
		
		double rateOfInterest=0.02;
		System.out.println("Principle amount:"+this.principle_amt);
		System.out.println("Rate of Interest:"+rateOfInterest);
	}
}
class SavingAccount extends Bank
{
	@Override
	public void display()
	{
		
		double rateOfInterest=0.03;
		System.out.println("Principle amount:"+this.principle_amt);
		System.out.println("Rate of Interest:"+rateOfInterest);
	}

}
class CurrentAccount extends Bank
{
	public void display()
	{
		
		double rateOfInterest=0.05;
		System.out.println("Principle amount:"+this.principle_amt);
		System.out.println("Rate of Interest:"+rateOfInterest);
	}
}
public class BankExample {

	public static void main(String[] args) {
		Bank b=new Bank();
		b.display();
		Bank b1=new SavingAccount();
		b1.display();
		SavingAccount s=new SavingAccount();
		s.display();
		CurrentAccount c=new CurrentAccount();
		c.display();
		
		Bank bk;
		bk=b;
		bk=s;
		bk=c;

	}

}
