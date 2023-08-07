package com.twodarray;
//43.WAP to print minimum in rows. Means e.g. arr[][] = {{22, 31, 9}, {12, 25, 16}} output is: 9 and 12. 

public class MinElementInRows {
	
	public static void printMinElementInRows(int a[][])
	{
		int len=a.length;
		System.out.println("Print Minimum element in rows");
		for(int i=0;i<len;i++)
		{
			int min=a[i][0];
			for(int j=1;j<len+1;j++)
			{
				if(a[i][j]<min)
				{
					min=a[i][j];
				}
			}
			System.out.println(min+" ");
		}
	}

	public static void main(String[] args) {
		int arr[][]= {{22,31,9},{12,25,16}};
		printMinElementInRows(arr);

	}

}
