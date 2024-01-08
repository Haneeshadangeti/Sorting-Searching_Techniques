
public class Linear_Search {
	public static String linearsearch_Approch1(int arr[],int key )
	{
		for(int i=0;i<=arr[i];i++)
		{
		if(key==arr[i])//checking the key and arr[i] is equal or not
		  {
			return ("key found at index "+i);
			
           }   
	    }
	      return ("key not found");
	}
		public static void LinearSearch_Approch2(int []arr,int key) //creating a method with two parameters
		{
		for(int i=0;i<=arr[i];i++)
		{
		if(key==arr[i])//checking the key and arr[i] is equal or not
			{
			System.out.println("key found at index"+i);
			System.exit(0);//stop the loop and return the value
           }   
	    }
		System.out.println("key not found");
		}
		public static void LinearSearch_Approch3(int []arr,int key) {
	for(int i=0;i<=arr[i];i++)
	{
	if(key==arr[i])//checking the key and arr[i] is equal or not
	  {
		System.out.println("key found at index"+i);
		return;//return the value
       }   
    }
	System.out.println("key not found");
		}
	
	
		
}
