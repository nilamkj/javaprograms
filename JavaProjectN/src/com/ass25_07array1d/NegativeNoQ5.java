package com.ass25_07array1d;
//5.WAP to print all negative elements in an array and also count total number of negative elements
//in an array.


public class NegativeNoQ5 {
	
	public static void main(String[] args) {
		int i=0,n,arr[]= {56,-30,12,-45,9,-5,-4};
		int len=arr.length;
		int count=0;
		for(i=0;i<len;i++)
		{
			if(arr[i]<0)
			{
				System.out.println("Negative array element:"+arr[i]);
				count++;
			}
		}
		System.out.println("Total number of negative array elements: "+count);

	}

}
