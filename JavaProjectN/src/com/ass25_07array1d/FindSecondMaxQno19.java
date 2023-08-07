package com.ass25_07array1d;

public class FindSecondMaxQno19 {

	public static void findSecondMax(int arr[])
	{
		int i,max=arr[0],secondmax=arr[1],len=arr.length;
		for(i=0;i<len;i++)
		{
			if(arr[i]>max)
			{
				secondmax=max;
				max=arr[i];
			}
			else if(arr[i]>secondmax && max>arr[i])
			{
				secondmax=arr[i];
			}
		}
		System.out.println("Max:"+max);
		System.out.println("Second max: "+secondmax);
	}
	public static void main(String[] args) {
		int num[]= {100,23,45,6,67,78,10};
		System.out.println("----Second largest number----");
		findSecondMax(num);

	}

}
