package com.twodarray;

public class TwoDArrayTest1 {

	public static void main(String[] args) {
		
		int mat[][]= {{23,56},{85,63}};
		int i,j;
		System.out.println("----2D----");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.println(mat[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
