package com.lab_20_07_23.model;

public class Person {
	protected int personId;
	protected String personName;
	protected int personAge;
	
	Person()
	{
		
	}
	public Person(int personId,String name)
	{
		super();
		this.personId=personId;
		this.personName=personName;
		
	}
	public Person(int personId,String name,int personAge)
	{
		this.personAge=personAge;
	}
	public void setPersonAge()
	{
		this.personAge=personAge;
	}
	public int getPersonAge()
	{
		return personAge;
	}
	public void setPersonId(int personId)
	{
		this.personId=personId;
	}
	public int getPersonId()
	{
		return personId;
	}
	public void setPersonName(String personName)
	{
		this.personName=personName;
	}
	public String getPersonName()
	{
		return personName;
	}
	public String toString()
	{
		return "Person Id:"+personId+"Person Name:"+personName+"Person Id"+personId;
	}
	
}
