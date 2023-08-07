package com.ass20_07abstract;
//1)You have to build a phone book. The phone book has the name and contact of a person. 
//This is an openly accessible book so it should be designed accordingly

abstract class PhoneBook
{
	public String name;
	public long contact;
	
	public PhoneBook(String name,long contact)
	{
		this.name=name;
		this.contact=contact;
	}
		
	public abstract void phoneDisplay();
	
	public void phoneData()
	{
		System.out.println("Phone Book Details");
		
	}
}
class Data extends PhoneBook
{
	Data(String name,long contact)
	{
		super(name,contact);
	}
	public void phoneDisplay()
	{
		System.out.println("Person name: "+name);
		System.out.println("Person Contact: "+contact);
		
	}

}
public class PhoneQno1 {

	public static void main(String[] args) {
		PhoneBook pb=new Data("Kaivalya",3478961209l);
		pb.phoneDisplay();
		pb.phoneData();
		
		

	}

}
