package com.Array.SelectionSort;

import java.util.Scanner;

public class SelectionSort_App {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int []arr=new int[scan.nextInt()];//creating a 1D array
		System.out.println("enter the numbers:");
		for(int i=0;i<=arr.length-1;i++)//to store values
		{
			
			arr[i]=scan.nextInt();
		}
		System.out.println("before sorting the array is:");
		for(int i=0;i<=arr.length-1;i++)//to display values before sorting
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int [] sortedArr=SelectionSort.SelectionSorting(arr);//invoking the method and storing in a variable 
		System.out.println("after sorting the array:");
		for(int i=0;i<=arr.length-1;i++)//to display the array after sorting 
		{
			System.out.print(sortedArr[i]+" ");
		}
		System.out.println();//to print next line
		scan.close();

	}

}
