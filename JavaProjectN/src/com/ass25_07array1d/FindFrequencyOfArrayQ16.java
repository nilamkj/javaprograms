package com.ass25_07array1d;
//16.WAP to count frequency of each element in an array.
public class FindFrequencyOfArrayQ16 {
	
	public static void findFrequencyOfArray(int arr[])
	{
		int i,j,len=arr.length;
		int count;
		
		for(i=0;i<len;i++)
		{
			count=1;
			if(arr[i]==-1)
			{
				continue;
			}
			for(j=i+1;j<len;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					arr[j]=-1;
				}
			}//inner
			System.out.println(arr[i]+" = "+count);
		}
	}
	
	public static void main(String[] args) {
		int num[]= {34,45,76,34,12,45,76,100,34,12,78,12};
		findFrequencyOfArray(num);

	}

}
