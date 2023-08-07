package com.arrayobjectandoned;

import java.util.Scanner;

public class ArrayDemo3scanner {

	public static void main(String[] args) {
		double marks[]=new double[10];
		int len=marks.length;
		int i,n;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("how manay marks you want to add in array: ");
		n=sc.nextInt();
		
		for(i=0;i<n;i++)
		{
			System.out.println("Enter Marks: ");
			marks[i]=sc.nextDouble();
		}
		System.out.println("-------Array-------");
		for(i=0;i<n;i++)
		{
			System.out.println("marks["+i+"]:"+marks[i]);
		}

	}

}
