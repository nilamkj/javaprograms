package com.arrayobjectandoned;

public class Student11 {
	private int rollno;
	private String name;
	private double marks;
	
	Student11()
	{
		
	}
	Student11(int rollno,String name,double marks)
	{
		this.rollno=rollno;
		this.name=name;
		this.marks=marks;
	}
	public String toString()
	{
		return "Roll no: "+rollno+ " Name: "+name+" Marks: "+marks;
	}
	public void setRollNo(int rollno)
	{
		this.rollno=rollno;
	}
	public int getRollNo()
	{
		return rollno;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setMarks(double marks)
	{
		this.marks=marks;
	}
	public double getMarks()
	{
		return marks;
	}

	}


