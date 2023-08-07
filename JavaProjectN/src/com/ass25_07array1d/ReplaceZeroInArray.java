package com.ass25_07array1d;

public class ReplaceZeroInArray {
	public static void replaceZeroInArray(int arr[])
	{
		int i,len=arr.length;
		for(i=0;i<len;i++)
		{
			if(arr[i]==0)
			{
				arr[i]=1;
				System.out.println(" "+arr[i]);
			}
		}
	}

	public static void main(String[] args) {
		int num[]= {78,2,55,0,8,42,79,0,0,69,56};
		replaceZeroInArray(num);
	}

}
