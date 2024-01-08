package com.Arrays.Bubble_Sort;

public class Bubble_Sort {
	public static int[] BubbleSorting(int []arr) {
	for(int i=0;i<=arr.length-2;i++)
	{
		for(int j=0;j<=arr.length-i-2;j++)
		{
			int temp;
			if(arr[j]>arr[j+1])
			{
				temp=arr[j+1];
				arr[j+1]=arr[j];
				arr[j]=temp;
			}
		}
	}
	return arr;
	}

}
