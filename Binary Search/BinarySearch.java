
public class BinarySearch {
	 public static void display(int arr[],int key)
     {
  	   int low=0;//creating a low variable
  	   int high=arr.length-1;//creating a high variable
  	   int mid=(low+high)/2;//calculating mid value
  	   while(low<=high)
  	   {
  		   if(key==arr[mid])//check whether key and arr[mid] is equal or not
  		   {
  			   System.out.println(key+" is found at index "+mid);
  			   return;
  		   }
  		   else if(key>arr[mid])//check whether key and arr[mid] is greater or not
  		   {
  			   low=mid+1;//if greater perform mid+1 
  			   mid=(low+high)/2;//high will be remains same
  		   }
  		   else {
  			   high=mid-1;//if it is lesser perform mid-1
  			   mid=(low+high)/2;//low will be remains same
  		   }
  		   
  	   }System.out.println("key not found");
     }

}
