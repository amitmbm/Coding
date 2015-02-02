package DS;

public class LeaderArray {
	
	public static void main (String args[])
	{
		int arr[] = {1,2,15,5,6,8,9,12,11,8};
		int max;
	//	System.out.println(arr.length);
		//System.out.println(-1);
		//System.out.println(arr[arr.length-1]);
		if(arr[arr.length-1] > arr[arr.length-2])
		{
			max=arr[arr.length-1];
		}
		else
			max=arr[arr.length-2];
		for(int j=arr.length-3;j>=0;j--)
		{
			System.out.println(max);
			if(arr[j]>max)
				max=arr[j];
		}
	}	

}
