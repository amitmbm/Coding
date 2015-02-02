package DS;

import java.util.Arrays;

/**
 * 
 * @author (Amit Khandelwal)
 *
 */
public class UglyNumberImprove {

	public static void main(String args[])
	{
		int N=25, min=0;
		int j=1,k=0,l;
		int arr[]= new int[25];
		arr[0]=1;
		int i2=0,i3=0,i5=0;
		while(j<N)
		{
			min=fn(arr[i2]*2,arr[i3]*3,arr[i5]*5);
			if(min== arr[i2]*2)
				i2++;
			if(min== arr[i3]*3)
				i3++;
			if(min == arr[i5]*5)
				i5++;
		arr[j++]=min;			
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static int fn(int a , int b , int c)
	{
		if(a<=b)
		{
			if(a<=c)
				return a;
		}
		else
			if(b<=c)
				return b;
		return c;
	}
}
