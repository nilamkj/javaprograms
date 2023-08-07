package com.twodarray;

public class AdditionOf2Matrices {

	public static void main(String[] args) {
		
		int mat1[][]= {{10,20},{30,40}};
		
		int mat2[][]= {{1,2},{3,4}};
		
		int sum[][]=new int[2][2];
		int i,j;
		
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				sum[i][j]=mat1[i][j]+mat2[i][j];
			}
		}
		System.out.println("----Sum of Two Matrices-----");
		
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.println(sum[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
