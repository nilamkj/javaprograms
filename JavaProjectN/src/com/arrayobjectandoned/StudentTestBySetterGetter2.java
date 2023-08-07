package com.arrayobjectandoned;

import java.util.Scanner;

public class StudentTestBySetterGetter2 
{
	static Scanner sc=new Scanner(System.in);
	public static void addStudents(Student11 s)
	{
		System.out.println("Enter roll no: ");
		s.setRollNo(sc.nextInt());
		
		System.out.println("Enter Name: ");
		s.setName(sc.next());
		
		System.out.println("Enter Marks: ");
		s.setMarks(sc.nextDouble());
	}
	public static void showStudent(Student11 sarr[])
	{
		for(Student11 s:sarr)
		{
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		Student11 str[]=new Student11[3];
		
		int i,len=str.length;
		
		for(i=0;i<len;i++)
		{
			str[i]=new Student11();
			addStudents(str[i]);
		}
		showStudent(str);
	}

}
