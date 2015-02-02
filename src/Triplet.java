
public class Triplet {
	
	public static void main(String args[])
	{
		int arr[] = {-1,-3,-4,5,6,8,10,25,26,101};
		boolean flag = false;
		int i=0,j=0,k=0;
		for(i=arr.length -1; i > 2; i--)
		{
			 
			for( j=i-1,k = 0; j>k; )
			{
				if((Math.pow(arr[j],2) + Math.pow(arr[k],2)) == Math.pow(arr[i], 2) )
				{
					flag =true;
					break;
				}
				else if((Math.pow(arr[j],2) + Math.pow(arr[k],2)) > Math.pow(arr[i], 2) )
				{
		           j=j-1;
				}
				else 
				{
					k=k+1;
				}
			}
			if(flag == true){
				System.out.println("triplet found and first element is:: "+ arr[j]+" second element is:: "+arr[k]+" third element is:: "+arr[i]);
				flag=false;
			}
		}
	    if(flag==false)   
		 	System.out.println("no such triplet exist");
	}

}
