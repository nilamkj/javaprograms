package com.ass25_07array1d;

import java.util.Scanner;

//7.	Write two methods that return the average of an array with following headers.
//a.	public static int average(int[] array)
//b.	public static double average(double[] array).
//c.	Write main and invoke the 2 methods. 

public class SumAvgUsingMethodQno7 {
public static int sumAvgUsingInt(int a[])
{
	int i,len=a.length,sum=0;
	
	for(i=0;i<len;i++)
	{
		sum=sum+a[i];
	}int avg=sum/len;
	return avg;
}
public static double sumAvgUsingDouble(int arr[])
{
	double len=arr.length,sum=0;
	for(int i=0;i<len;i++)
	{
		sum=sum+arr[i];
	}
	double avg=sum/len;
	return avg;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of element for integer method:");
		int n=sc.nextInt();
		
		int num[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter integer element:");
			num[i]=sc.nextInt();
		}
		int ans=sumAvgUsingInt(num);
		System.out.println("Average for int: "+ans);
		
		System.out.println("Enter the number of element for double method:");
		int s=sc.nextInt();
		
		int num1[]=new int[s];
		for(int i=0;i<s;i++)
		{
			System.out.println("Enter double element:");
			num1[i]=sc.nextInt();
		}
		double ans1=sumAvgUsingDouble(num1);
		System.out.println("Average for double: "+ans1);

	}

}
