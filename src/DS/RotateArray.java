package DS;

public class RotateArray {

	
	public static void main(String args[])
	{
		 int arr[] = {10 ,9 ,8 ,7 ,1 ,2,3,4,5,6};
		 
		 int low=0;
		 int high=9;
		 int mid=0;
		// System.out.println("enter number to search");
		 int item=6;
		 while(low<=high)
		 {
			 mid=(low+high)/2;
			 System.out.println("mid value is "+mid);
			 if(item == arr[mid])
			 {
				 System.out.println("item found at pos "+mid);
				 System.exit(1);
			 }
			 else if((item > arr[mid] && item <= arr[high]) || (item < arr[mid] && item >=arr[high]))
				 low=mid+1;
			 else if((item > arr[mid] && item > arr[high]) || (item < arr[mid] && item < arr[high]))
				// {)
			    high=mid-1;
				// }
		 }
		 System.out.println("item is not in the Array");
	}
}
