package com.Array.SelectionSort;

public class SelectionSort {
	public static int[] SelectionSorting(int arr[])//creating a method with one parameter
	{
		for(int i=0;i<=arr.length-2;i++)
		{
			int min=arr[i];//creating a min variable
			int pos=i;//creating a pos variable
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[j]<min)//if arr[j] is lesser then the min value
				{
					min=arr[j];//min value will be arr[j]
					pos=j;// pos value will be index number
				}
				
			}
			//swapping the arr[i] and arr[pos]
			int temp;//Initializing the temp variable
			temp=arr[i];
			arr[i]=arr[pos];
			arr[pos]=temp;
			
		}
		return arr;//returning a array
		
	}

}
