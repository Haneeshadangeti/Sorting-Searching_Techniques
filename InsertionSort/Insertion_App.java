package com.Array.InsertionSort;

import java.util.Scanner;

public class Insertion_App
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of array");
		int []arr=new int[scan.nextInt()];
		System.out.println("enter the numbers:");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("The array before sorting is:");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int [] sortedarr=Insertion.insertion(arr);
		System.out.println("The array after sorting is:");
		for(int i=0;i<=sortedarr.length-1;i++)
		{
			System.out.print(sortedarr[i]+" ");
		}
		System.out.println();
		
	}

}
