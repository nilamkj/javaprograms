package com.arrayobjectandoned;

import java.util.Arrays;

class Student
{
	int rollno;
	String name;
	int marks[];
	
	Student(int rollno,String name,int marks[])
	{
		this.rollno=rollno;
		this.name=name;
		this.marks=marks;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + Arrays.toString(marks) + "]";
	}
	public  void sumOfMarks(int a[])
	{
		Arrays.toString(marks);
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		int avg=sum/a.length;
		System.out.println("Sum of "+name+" total marks= "+sum);
		System.out.println("Average of "+name+" total marks= "+avg);
	}
	
}
public class TestArrayInstance {

	public static void main(String[] args) {
		int m1[]= {98,95,92,91,76};
		int m2[]= {54,85,82,41,16};
		int m3[]= {80,95,19,91,56};		
		
		Student s=new Student(101,"Shivani",m1);
		System.out.println(s);
		Student s1=new Student(102,"Ulka",m2);
		System.out.println(s1);
		Student s2=new Student(103,"Nilam",m3);
		System.out.println(s2);
		s.sumOfMarks(m1);
		s1.sumOfMarks(m2);
		s2.sumOfMarks(m3);
	}

}
