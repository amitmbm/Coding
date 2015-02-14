package DS;

public class FlipkartPS {
	
	public static void main(String args[])
	{
		int number=31;
		System.out.println("nearest possible number is "+ fn(number)+"which is the squareroot of given number"+ number);
	}

	public static int fn(int number)
	{
		int low=1;
		int high=number;
		int mid=(low+high)/2;
		while(low<=high)
		{
			mid=(low+high)/2;
			if((mid*mid) % number == 0)
				return mid;
			else if ((mid*mid) < number)
				low=mid+1;
			else
				high=mid-1;
		}
		int lowdiff = Math.abs(low*low - number);
		int highdiff = Math.abs(high*high - number);
		return ((highdiff >= lowdiff ? low:high));
		
	}
}
