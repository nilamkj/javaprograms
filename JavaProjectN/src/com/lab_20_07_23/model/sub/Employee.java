package com.lab_20_07_23.model.sub;
import com.lab_20_07_23.model.Person;

public class Employee extends Person {
	String designation;
	
	
	public Employee(int personId,String name,int personAge,String designation)
	{ 	
		
		super(personId,name,personAge);
		this.designation=designation;
	}
	public void setDesignation(String designation)
	{
		this.designation=designation;
	}
	public String getDesignation()
	{
		return designation;
	}
	public String toString()
	{
		return "Person Id:"+personId+"Person Name:"+personName+"Person Id"+personId+"designation" +designation;
	}
}
