package com.ass25_07array2d;
//43..2..WAP to print maximum in columns. Means e.g. arr[][]= {{22, 31, 9}, {12, 5, 16}, {34, 42, 2}} 
//output is: 34, 42, and 16. 
public class PrintMaxElement {
	
	public static void printMaxElementInCols(int a[][])
	{    
		int len=a.length;
		System.out.println("Maximum elements in columns");
		for(int i=0;i<len;i++)
		{
		   int  max=a[0][i];
			for(int j=0; j<len;j++)
			{
				if(a[j][i]>max)
				{
					max=a[j][i];
				}
			}
			System.out.println(max+" ");
		}
	}
	
//	public static void columnElementsPrinting(int a[][],int col,int row)
//	{
//		
//		for(int i=0;i<col;i++)
//		{
//			int min=Integer.MAX_VALUE;
//			for(int j=0;j<row;j++)
//			{
//				if(a[j][i]<min)
//				{
//					min=a[j][i];
//				}
//			}
//			System.out.println(min+" ");
//			System.out.println("-----------");
//		}
//		}
	
	public static void main(String[] args) {
		int arr[][]= {{22,31,9},{12,5,16},{34,42,2}};
		printMaxElementInCols(arr);
	}
}

	