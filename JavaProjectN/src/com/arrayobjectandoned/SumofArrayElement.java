package com.arrayobjectandoned;
import java.util.Scanner;
//WAP to find sum of array element present in array

public class SumofArrayElement {
	//passing array as an argument
	public static int sumofArrayElement(int a[])
	{
		int sum=0;
		int length=a.length;
		for(int i=0;i<length;i++)
		{
			sum=sum+a[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		int num[]=new int[10];
		int i,len=num.length,n,sum=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of elements: ");
		n=sc.nextInt();
		
		//step 1=insert elements in array
		
		for(i=0;i<n;i++)
		{
			System.out.println("Enter element: ");
			num[i]=sc.nextInt();
		}
		int ans=sumofArrayElement(num);
		System.out.println("sum: "+ans);
	}

}
