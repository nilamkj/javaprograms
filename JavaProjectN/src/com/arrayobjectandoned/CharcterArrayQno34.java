package com.arrayobjectandoned;
//34.WAP to find min character in character array. Means e.g. arr[] = [‘A’, ‘D’, ‘E’, ‘x’, ‘z’, ‘R’], 
//so min character is ‘A’. 
public class CharcterArrayQno34 {
public static int findMaxChar(char ch[])
{
	char max=ch[0];
	int len=ch.length;
	for(int i=0;i<len;i++)
	{
		if(ch[i]>max)
		{
			max=ch[i];
		}
			
	}
	return max;
}
public static int findMinChar(char ch[])
{
	char min=ch[0];
	int len=ch.length;
	for(int i=0;i<len;i++)
	{
		if(ch[i]>min)
		{
			min=ch[i];
		}
	}
	return min;
}
	public static void main(String[] args) {
		char arr[]= {'A','D','E','x','z','R'};
		
		//char min=arr[0];
		findMaxChar(arr);
		findMinChar(arr);
		

	}

}
