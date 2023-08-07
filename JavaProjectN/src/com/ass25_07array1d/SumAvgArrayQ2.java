package com.ass25_07array1d;
import java.util.Scanner;
//2.WAP to accept dimension of 1D array and create and accept data in that array. Calculate the
//sum and average value of array elements.

public class SumAvgArrayQ2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. the array elements: ");
		int n=sc.nextInt();
		int a[];
		a=new int[n];
		int i,len=a.length,sum=0;
		double avg=0;
			
		for(i=0;i<n;i++)
		{
			System.out.println("Enter Elements:");
			a[i]=sc.nextInt();
		}
		for(i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			
		}
		avg=sum/n;
		System.out.println("sum: "+sum);
		System.out.println("Average of array Elements: "+avg);

	}

}
