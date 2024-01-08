import java.util.Scanner;

public class Linear_SearchApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int size=scan.nextInt();//creating a variable
		System.out.println("enter the key element has to be searched:");
		int key=scan.nextInt();//creating a variable
		int []arr=new int[size];//creating a 1D array
		for(int i=0;i<=arr.length-1;i++)//to store a values in array
		{
			System.out.println("enter the numbers:");
			arr[i]=scan.nextInt();
	     }
		for(int i=0;i<=arr.length-1;i++)//to display a values in array
		{
			System.out.println(" the numbers are :"+arr[i]);

	    }
		Linear_Search.linearsearch_Approch1(arr, key);//invoking a method
		Linear_Search.LinearSearch_Approch2(arr, key);//invoking a method
		Linear_Search.LinearSearch_Approch3(arr, key);//invoking a method
		scan.close();//closing the scanner class
	}
}
