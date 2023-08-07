package com.arrayobjectandoned;

import java.util.Scanner;

public class ArrayDemoString {

	public static void main(String[] args) {
		String name[]=new String[10];
		int len=name.length;
		int i,n;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("How many names you want to add: " );
		n=sc.nextInt();
		
		for(i=0;i<n;i++)
		{
			System.out.println("Enter Name: ");
			name[i]=sc.next();
		}
		System.out.println("--------Array----------");
		for(i=0;i<n;i++)
		{
			System.out.println("Name["+i+"]:"+name[i]);
		}
		sc.close();
	}

}
