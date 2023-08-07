package com.ass25_07array1d;
//14.	WAP to print all unique elements in the array.
public class UniqueElementQno14 {
	public static void uniqueElement(int a[])
	{
		int len=a.length;
		int count,i,j;
		for(i=0;i<len;i++)
		{
			count=0;
			if(a[i]==-1)
				continue;
			for(j=i+1;j<len;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					a[j]=-1;
				}
			}
			if(count==0)
			{
				System.out.println(a[i]);
			}
		}
	}

	public static void main(String[] args) {
		int a[]= {21,34,56,7,5,21,34,5};
		uniqueElement(a);

	}

}
