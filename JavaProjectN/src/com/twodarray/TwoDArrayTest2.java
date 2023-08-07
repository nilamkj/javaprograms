package com.twodarray;

import java.util.Scanner;

public class TwoDArrayTest2 {

	public static void main(String[] args) {
		int tab[][]=new int[3][3];
		int i,j,rows,cols;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of Rows:");
		rows=sc.nextInt();
		System.out.println("Enter no. of Cols:");
		cols=sc.nextInt();
		
		System.out.println("Enter element in 2D array\n");
		
		for(i=0;i<rows;i++)
		{
			for(j=0;j<cols;j++)
			{
				System.out.println("Enter element for the tab["+i+"]["+j+"]");
				tab[i][j]=sc.nextInt();
			}
		}
		System.out.println("--------2d Array-------");
		for(i=0;i<rows;i++)
		{
			for(j=0;j<cols;j++)
			{
				System.out.println(tab[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
