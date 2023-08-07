package com.ass_methodoverriding;
//5)WAP to create class Programmer with Method workingHours().create class Employee which extends 
//Programmer implement workingHours()differently in child

class Programmer
{
	int wHours=8;
	public void workingHours()
	{
		System.out.println("Working Hours: "+wHours);
	}
}
class Employee extends Programmer
{
	//@Override
	public void workingHours()
	{
		System.out.println("Working Hours: "+wHours);
	}
	
}
public class ProgrammerOverriding {

	public static void main(String[] args) {
		Programmer p=new Programmer();
		p.workingHours();
		
		Employee e=new Employee();
		e.workingHours();
		
		

	}

}
