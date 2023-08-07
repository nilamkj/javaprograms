package com.ass25_07array1d;
//1.WAP to merge 2 arrays to 3rd array. 3rd array should not have elements of same value.
public class Merge2ArrayQno17 
{
	public static int[] mergeTwoArrays(int a[],int b[])
	{
		int i,j=0;
		int len1=a.length,len2=b.length;
		int len3=len1+len2;
		int newArr[]=new int[len3];
		
		for(i=0;i<len3;i++)
		{
			if(i<len1)
			{
				newArr[i]=a[i];
			}
			else
			{
				newArr[i]=b[j];
				j++;
			}
		}
		return newArr;
	}
	
	public static void main(String[] args) {
		int arr1[]= {10,20,30,40,50};
		int arr2[]= {40,50,60,70,80};

		System.out.println("---Merge Array-----");
		int mergeArr[]=mergeTwoArrays(arr1,arr2);
		
		for(int a:mergeArr)
		{
			System.out.println(a);
		}

	}

}
