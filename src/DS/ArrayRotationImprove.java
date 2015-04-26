package DS;

/*
 * this code is working fine with all the test-cases passed .
 */

public class ArrayRotationImprove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {8, 10, 20, 80, 100, 200, 400, 500, 3, 2, 1};
		//int res = fn(arr,500);
		for(int i=0;i< arr.length;i++)
		{
			System.out.println("given number in array"+ fn(arr,arr[i]));

		}
        
	}
	
	static int fn(int arr[] , int number)
	{
		//return false;
		int low = 0 , high= arr.length-1;
		int mid=0;//=(low+high)/2;
		 while(low<=high)
	        {
	            mid=(low+high)/2;
	            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1] )
	                break;
	            else if(arr[mid] < arr[mid-1] && arr[mid] > arr[mid+1] )
	                high=mid-1;
	            else 
	                low=mid+1;
	        }
	        System.out.println("highest number found at position" + arr[mid]);
	        
	        if(number < arr[mid] && number >= arr[0])
	        {
	          low=0;
	          high=mid-1;
	          mid=0;
	          while(low<=high)
		        {
		            mid=(low+high)/2;
		            if(number == arr[mid] )
		                break;
		            else if(number > arr[mid] )
		                low=mid+1;
		            else 
		                high=mid-1;
		        }
	          return mid;
	        }
	        else
	        {
	        	  low=mid;
		          high= arr.length-1;
		          mid=0;
		          while(low<=high)
			        {
			            mid=(low+high)/2;
			            if(number == arr[mid] )
			              break;
			            else if(number > arr[mid] )
			              
			            high=mid-1;
			            else 
			            	  low=mid+1;
			        }
		          return mid;
		        }
	        }
	
	
	}

