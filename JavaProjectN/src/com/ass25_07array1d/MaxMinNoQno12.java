package com.ass25_07array1d;
//12.	WAP to find the maximum and minimum value in an array.
public class MaxMinNoQno12 {

	public static int findMaxNum(int arr[])
	{
		int max=arr[0];
		int i,len=arr.length;
		for(i=1;i<len;i++)
		{
			//if(max<arr[i])
			//{
			//	max=arr[i];
			//}
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}
	public static int findMinNum(int arr[])
	{
		int min=arr[0];
		int i,len=arr.length;
		for(i=1;i<len;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		return min;
	}


	public static void main(String[] args) {
		int num[]=new int[] {111,45,67,80,23,5,65};
		
		System.out.println("Max number from array: "+findMaxNum(num));
		System.out.println("Min number from array: "+findMinNum(num));

	}

}
