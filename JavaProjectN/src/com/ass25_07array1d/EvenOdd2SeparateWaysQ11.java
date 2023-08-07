package com.ass25_07array1d;
//11.	WAP to put even and odd elements of array in two separate arrays.

public class EvenOdd2SeparateWaysQ11 {
private static void evenOddSeparateWays(int arr[])
	 {
		int newEven[],newOdd[];
		int i,len=arr.length;
		int ieven=0,iodd=0;
		
		newEven=new int[arr.length];
		newOdd=new int[arr.length];
		for(i=0;i<len;i++)
		{
			if(arr[i]%2==0)
			{
				newEven[ieven]=arr[i];
				ieven++;
			}
			else
			{
				newOdd[iodd]=arr[i];
				iodd++;
			}
		}
		System.out.println("Printing Array of even numbers");
		for(i=0;i<ieven;i++)
		{
			System.out.println(newEven[i]);
		}
		System.out.println("Printing Array of odd numbers");
		for(i=0;i<iodd;i++)
		{
			System.out.println(newOdd[i]);
		}
	}
	 public static void main(String[] args)
	 {
		 int num[]= {2,5,8,97,45,32,9};
		 evenOddSeparateWays(num);
	 }
}
