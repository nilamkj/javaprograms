package com.twodarray;

public class DiagonalElements {
	
	public static void printDiagonalElement(int mat[][],int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j)
				{
					System.out.println(mat[i][j]+", ");
				}
			}
		}
		System.out.println(" ");
	}

	public static void main(String[] args) {
		int n=3;
		int a[][]= {{1,2,3},
					{4,5,6},
					{7,8,9}};
		printDiagonalElement(a,n);

	}

}
