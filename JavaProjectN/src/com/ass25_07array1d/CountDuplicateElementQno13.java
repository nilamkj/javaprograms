package com.ass25_07array1d;

import java.util.Scanner;

//13.WAP to find and count total number of duplicate elements in an array.

public class CountDuplicateElementQno13 
{
	public static void countDuplicateElement(int a[])
	{
		int i,j,len=a.length;
		for(i=0;i<len;i++)
		{
			for(j=i+1;j<len;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("Duplicate elements are: "+a[i]);
				}
					
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of element: ");
		int n=sc.nextInt();
		int num[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the element: ");
			num[i]=sc.nextInt();
		}
		countDuplicateElement(num);
	}

}
