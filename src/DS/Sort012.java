package DS;

import java.util.Arrays;

/*
 * sorting the number using only one pass , alternative is to just count the number of 0,1,2 and in second pass 
 * just print them . point to note here is that low and mid both started from the 0 position.
 * Also one more optimization we can do is by reducing the range of 2 and 0 in first pass , ie if first and last 5 elment is 0 and 2 then low,mid=5 and hihg=length-5.
 */
public class Sort012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr [] = {0,1,1,0,1,2,0,1,2,1,1,1,0,0,1};
		
		int low=0,mid=0,high=arr.length-1;
		while(mid<=high)
		{
		   if(arr[mid] == 0)
		   {
			   swap(arr,low,mid);
                mid++;low++;
		   }
		   else if(arr[mid] ==1)
			   mid++;
		   else
		   {
			   swap(arr,mid,high);
			   high--;
		   }
			  
		}
		System.out.println("sorted array is below");
		System.out.println(" "+ Arrays.toString(arr));

	}
	
	public static  void swap(int arr[] , int a, int b)
	{
		int tmp;
		tmp=arr[a];
		arr[a]=arr[b];
		arr[b]=tmp;
	}

}
