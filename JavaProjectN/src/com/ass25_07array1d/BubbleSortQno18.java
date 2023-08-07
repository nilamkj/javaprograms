package com.ass25_07array1d;
//18.	WAP sort array elements in ascending order.
public class BubbleSortQno18 {

	public static int[] sortElements(int arr[])
	{
		int i,j,len=arr.length;
		for(i=0;i<len;i++)
		{
			for(j=0;j<len-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		int num[]= {23,45,6,67,78,10};
		
		int sortedarr[]=sortElements(num);
		System.out.println("-----Sorted Array-----");
		for(int s:sortedarr)
		{
			System.out.println(s);
		}

	}

}
