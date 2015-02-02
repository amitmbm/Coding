package DS;

public class NumberOfInt {
	
	public static void main(String args[])
	{
		int a[]={0,1,2,3,4,5,5,6,7,7,7,7,7,7,7,7,9,9,9,9};
		int abc=NoOfItem(a,1);
		System.out.println("number of occurance is"+abc);
	  
		
	}
	
	public static int NoOfItem(int a[] , int item)
	{
	int low,mid,high,cnt=0,flag=0,total=0,n;
		
		
		low=0;
		high=a.length -1;
		n=high;
		int tmp_mid=0;
		int tmp_mid1=0;
		while(low <= high)
		{
			mid=(low+high)/2;
	
			if(item > a[high] || item < a[low])
			{
				flag=1;
				break;
			}
			
			else if( item == a[mid])
			{
				//System.out.println("inside the == loop"+mid);
				if(mid-1 >= 0 && item > a[mid-1]){
					System.out.println("inside the breaking cond");
				tmp_mid=mid;
				break;}
				else if(mid-1 == low && a[mid-1] == item){
					System.out.println("inside the breaking cond :: 2");
					tmp_mid=low;
					break;
				}
				else if(mid-1 >= 0 && item == a[mid-1]){
					high=mid-1;
				}
				
			}
		
			else if(item > a[mid])
			{
				low= mid+1;
			}
			else {
				high = mid-1;
			}
			cnt++;
		//	System.out.println("low"+low+"high"+high);
		}
		System.out.println("value of first index is"+ tmp_mid);
		System.out.println("value cnt after first "+cnt);
		//System.out.println("value of flag after first while loop"+ flag);
	 if(flag!=1)
		{
			high= a.length -1;
			low= tmp_mid +1;
			while(low <= high)
			{
				mid=(low+high)/2;
			//	System.out.println("mid value is"+mid);
				if(item > a[high] || item < a[low])
				{
					flag=-1;
					break;
				}
				else if( item == a[mid])
			{
				//System.out.println("inside the == loop"+mid);
				if(mid+1 <= n && item < a[mid+1]){
					//System.out.println("inside the breaking cond");
				tmp_mid1=mid;
				break;}
				else if(mid+1 == high && a[mid+1] == item){
					//System.out.println("inside the breaking cond :: 2");
					tmp_mid1=high;
					break;
				}
				else if(mid+1 <= n && item == a[mid+1]){
					low=mid+1;
				}
				
			}
		
				else if(item < a[mid])
				{
					high= mid-1;
				}
	
				else {
					low = mid+1;
					}
				cnt++;
				
			}
		}
		else
		{
			System.out.println("item is not in the array");
			System.exit(1);
		}
		System.out.println("value of second index is "+tmp_mid1);
		System.out.println("value cnt after second "+cnt);
		if(flag== -1)
		{
			return 1;
		}
		else
		{
			//System.out.println("array length is "+ tmp_mid1);
			return (tmp_mid1-tmp_mid +1);
		}
		//return 1;
	}

}
