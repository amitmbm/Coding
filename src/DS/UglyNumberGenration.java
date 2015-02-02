package DS;

import java.util.Arrays;


/**
 * 
 * 
 * @author KH1871(it is not best solution as it takes O(n)*(o(log2+log3+ln5))
 *
 */
public class UglyNumberGenration {
	
	public static void main(String args[])
	{
		int N=25;
		int j=1,k=0,l;
		int arr[]= new int[25];
		while(k<N)
		{
		   l=fn(j,2);
		   l=fn(l,3);
		   l=fn(l,5);
		   
		   if(l==1){
			   arr[k++]=j;
		   }
		   j++;
		}
			
		
		System.out.println("below are the genrated numbers");
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static int fn(int a , int b)
	{
		while(a%b == 0)
			a=a/b;
		return a; 
	}

}
