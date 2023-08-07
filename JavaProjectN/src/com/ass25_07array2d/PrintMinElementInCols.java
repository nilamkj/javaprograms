package com.ass25_07array2d;
//44.WAP to print minimum in columns. Means e.g. arr[][]={{22, 31, 9}, {12, 5, 16}, {34, 42, 2}} 
//output is: 12, 5, 2.

public class PrintMinElementInCols {

	public static void printMinElementInCols(int a[][])
	{    
		int len=a.length;

		System.out.println("Minimum elements in columns");

		for(int i=0;i<len;i++)
		{
		   int  min=a[0][i];
			for(int j=0; j<len;j++)
			{
				if(a[j][i]<min)
				{
					min=a[j][i];
				}
			}
			System.out.println(min+" ");
		}
	}
	public static void main(String[] args) {
		int arr[][]= {{22,31,9},{12,5,16},{34,42,2}};
		printMinElementInCols(arr);
	}
}