package DS;

/*
 * this is array rotation problem but it will not work for the element 
 * on which rotation happened.
 */
public class ArrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {8, 10, 20, 80, 100, 200, 400, 500, 3, 2, 1};
		int res = fn(arr,500);
        System.out.println("given number in array"+ res);
	}
	 
	static int fn(int arr[] , int number)
	{
		//return false;
		int low = 0 , high= arr.length-1;
		int mid;//=(low+high)/2;
		 while(low<=high)
	        {
	            mid=(low+high)/2;
	            if(number == arr[mid] )
	                return mid;
	            else if(number < arr[mid] && number >= arr[low] )
	                high=mid-1;
	            else if (number > arr[mid] && number > arr[low])
	                low=mid+1;
	            else if (number > arr[mid] && number <= arr[low])
	            	high=mid-1;
	            else if(number < arr[mid] && number < arr[low]  )
	                  low=mid+1;
	           // else if (number < arr[low] && number > arr[mid])
	             //     high=mid-1;
	            
	        }
	        return -1;
	}

}
