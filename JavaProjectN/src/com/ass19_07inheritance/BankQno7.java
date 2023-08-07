package com.ass19_07inheritance;
//7.Create class Bank(super)having getInterest() method returning interest .create any three child 
//classes like sbi,icici,axis and override method in respective class

class Bank 
	{
	    int getInterest()
	    {
	        return 2;
	    }
}

class SBI extends Bank
{
	    int getInterest()
	    {
	        return 3;
	    }
}

class ICICI extends Bank
{
	    int getInterest()
	    {
	        return 5;
	    }
}

class AXIS extends Bank 
{
	    int getInterest()
	    {
	        return 7;
	    }
}

public class BankQno7 
{
	   public static void main(String[] args)
	   {
		   Bank sbi = new SBI();
	       Bank icici = new ICICI();
	       Bank axis = new AXIS();
	       System.out.println("SBI Bank interest rate: " + sbi.getInterest() + "%");
	       System.out.println("ICICI Bank interest rate: " + icici.getInterest() + "%");
	       System.out.println("AXIS Bank interest rate: " + axis.getInterest() + "%");
	   
		}
 }
