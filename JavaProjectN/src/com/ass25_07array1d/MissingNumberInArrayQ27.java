package com.ass25_07array1d;

import java.util.Arrays;

//27.	Write a Java program to find a missing number in an array. Means e.g. array has 1 to n element 
//in sequence(n can be 50 or 100) arr[] = [1, 2, 3, 4, 6, 7] So missing no is 5 
public class MissingNumberInArrayQ27 {
	static int min,max;
public static void minMaxNumber(int a[] )
{
	int i,len=a.length;
	int max=a[0],min=a[0];
	for(i=1;i<len;i++)
	{
		if(a[i]>max)
		{
			max=a[i];
		}	
			if(a[i]<min)
			{
				min=a[i];
		}
	}
	System.out.println("Max number: "+max);
	System.out.println("Min number: "+min);
	
	int newarray[]= {1,2,3,4,5,6,7};
	newarray[i]=0;
	for(i=min;i<=max;i++)
	{
		newarray[i]=i;
	}
	for(int j=0;j<a.length;j++)
	{
		for(int k=0;k<newarray.length;k++)
		{
			if(a[j]==newarray[k])
			{
				newarray[j]=i;
			}
		}
	}System.out.println(newarray[i]);
}

	public static void main(String[] args) {
		int num[]= {1,2,3,4,6,7};
		
		minMaxNumber(num);
			
}

}
