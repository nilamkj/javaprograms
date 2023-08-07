package com.ass25_07array1d;
import java.util.Scanner;
//8.WAP to find/search element in array also print its index value

public class SearchElementInArrayQ8 {
	public static void serachElementInArray(int arr[], int searchElement)
	{
		int i,len=arr.length,position=-1;
		
		for(i=0;i<len;i++)
		{
			if(searchElement==arr[i])
			{
				position=i;
				break;
			}
		}
		if(position!=-1)
		{
			System.out.println(searchElement+" is present at index: "+position);
		}
		else
		{
			System.out.println(searchElement+" is not present in given array");
		}
	}
	public static void main(String[] args) 
	{
		int num[]= {23,45,63,52,6,7,88};
		int search;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number which you want to search");
		search=sc.nextInt();
		serachElementInArray(num,search);
	}

}
