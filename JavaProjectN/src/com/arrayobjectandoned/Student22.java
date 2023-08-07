package com.arrayobjectandoned;

import java.util.Arrays;

public class Student22 {

	private int rollno;
	private String name;
	private double marks[];
	
	Student22()
	{
		
	}
	Student22(int rollno,String name,double marks[])
	{
		//marks=new double[3];
		this.rollno=rollno;
		this.name=name;
		this.marks=marks;
	}
	
	public void display()
	{
		System.out.println("Roll No: "+rollno);
		System.out.println("Name: "+name);
		System.out.println("Marks obtain in mcq,xobin & written test: "+Arrays.toString(marks));
		
//		for(int i=0;i<marks.length;i++)
//		{
//			System.out.println(i);
//		}
	}
}