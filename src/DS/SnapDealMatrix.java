package DS;

public class SnapDealMatrix {
	
	public static void main(String args[])
	{
		int arr[][]={{1,20,40,60},
				       {12,22,42,62},
				       {15,25,48,70},
				       {33,45,68,100}};
		int item=33;
		boolean isThere = fn(arr,item);
		System.out.println("item is"+ item);
		System.out.println("is item found:::"+ isThere);
	}
	
	public static boolean fn (int arr[][] , int item)
	{
		for(int j=3,i=0;j>=0&&i<=3;)
		{
			if(arr[i][j] == item)
			{
				return true;
			}
			else if (item < arr[i][j])
				j--;
			else
				i++;
		}
		return false;
	}

}
