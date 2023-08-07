package com.arrayobjectandoned;

import java.util.Scanner;

public class StudentTestBySetterGetter {

	public static void main(String[] args) {
		
		Student11 str[]=new Student11[3];
		int i,len=str.length;
		System.out.println("Enter data for student array");
		Scanner sc=new Scanner(System.in);
		for(i=0;i<len;i++)
		{
			str[i]=new Student11();
			System.out.println("Enter roll no: ");
			str[i].setRollNo(sc.nextInt());
			
			System.out.println("Enter Name: ");
			str[i].setName(sc.next());
			
			System.out.println("Enter Marks: ");
			str[i].setMarks(sc.nextDouble());

		}
		System.out.println("-------Display-------");

	}

}
