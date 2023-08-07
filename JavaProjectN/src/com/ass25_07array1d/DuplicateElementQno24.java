package com.ass25_07array1d;
//24.Write a Java program to find the duplicate values of an array of integer values. Means e.g. 
//arr[] = [3, 10, 90, 78, 56, 10, 78, 34, 61], so duplicates are 10 and 78. 
public class DuplicateElementQno24 {
	public static void duplicateElements(int arr[])
	{
		int i,j,len=arr.length;
		int count;
	
		for(i=0;i<len;i++)
		{
			count=0;
			if(arr[i]==-1)
				continue;
			for(j=i+1;j<len;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					arr[j]=-1;
				}
			}//inner
			if(count>=1)
			{
				System.out.println(arr[i]);
			}
		}
		
	}
	public static void main(String[] args) {
		int num[]= {3,10,90,78,56,10,78,34,61};
		duplicateElements(num);
		

	}

}
