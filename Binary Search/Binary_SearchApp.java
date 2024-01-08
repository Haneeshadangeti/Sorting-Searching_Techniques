import java.util.Scanner;

public class Binary_SearchApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int size=scan.nextInt();//creating a variable
		System.out.println("enter the key element has to be searched:");
		int key=scan.nextInt();//creating a variable
		int []arr=new int[size];//creating a array
		for(int i=0;i<=arr.length-1;i++)//to storing a values
		{
			System.out.println("enter the numbers:");
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<=arr.length-1;i++)//to display a values
		{
			System.out.println("the numbers are:"+arr[i]);
		}
		
		BinarySearch.display(arr,key);//invoking a method
		scan.close();
	}
      
}
      
