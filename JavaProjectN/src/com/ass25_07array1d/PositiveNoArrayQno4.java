package com.ass25_07array1d;
//4.WAP to take array and print all positive numbers 

public class PositiveNoArrayQno4 {
	public static void main(String args[])
	{
	int arr[]= {5,-8,0,34,-23,-7,9};
	int i,len=arr.length;
	for(i=0;i<len;i++)
	{
		if(arr[i]>=0)
		{
		System.out.println(arr[i]);
		}
	}
}
}