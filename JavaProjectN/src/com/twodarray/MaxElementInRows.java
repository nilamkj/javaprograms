package com.twodarray;
//42. WAP to print maximum in rows. Means e.g. arr[][] = {{22, 31, 9}, {12, 25, 16}} output is: 31 and 25. 

public class MaxElementInRows {
	
	public static void printMaxElementInRows(int a[][])
	{
		int len=a.length;
		System.out.println("Print Max Element in Rows");
		for(int i=0;i<len;i++)
		{
			int max=a[i][0];
			for(int j=0;j<len;j++)
			{
				if(a[i][j]>max)
				{
					max=a[i][j];
				}
			}
			System.out.println(max+" ");
		}
	}

	public static void main(String[] args) {
		int arr[][]= {{22,31,9},{12,25,16}};
		printMaxElementInRows(arr);

	}

}
