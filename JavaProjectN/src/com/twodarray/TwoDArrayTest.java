package com.twodarray;

public class TwoDArrayTest {

	public static void main(String[] args) {
		int mat[][];
		mat=new int[3][3];
		//or
		int arr[][]=new int[2][2];
		
		//or
		int rows=4;
		int cols=3;
		
		int arr1[][]=new int[rows][cols];
		
		//accessing 2d array
		System.out.println("---Element in 2D array before inserting elements---");
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);

		//After inserting element in array
		arr[0][0]=52;
		arr[0][1]=96;
		arr[1][0]=86;
		arr[1][1]=40;
		
		System.out.println("---Element in 2D array after inserting elements---");
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		
		System.out.println("-----Element in 2D array using for loop------");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.println(arr[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("-----Element in 2D array using for loop------");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.println("Element at arr["+i+"]["+j+"]="+arr[i][j]);
			}
		}
		
	}

}
