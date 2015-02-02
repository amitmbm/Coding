package DS;

/**
 * 
 * @author KH1871(MS question)
 * concept is position based search not the element based 
 */
public class RandomMS {
    
	static int a[]={10,11,12,13,14,15,16,17,18,19,20};
	static int j=-1;
	public static void main(String[] args) {
     		// TODO Auto-generated method stub
		// int[]= new int[11];
		int min=10,max=20;
		for(int i=0;i<=10;i++){
			 int a=fnRandom(min,max);
			 System.out.println("RANDOM NUMBER is" + a);
		}
        
	}
	
	public static int fnRandom(int min , int max)
	{
		//System.out.println("min"+min);
		
		int i = (int) (Math.random()*(max-min+1));
		// not sure whether below condition shoud check for < or <= condition , idellay it should be greater than the J , which denotes the current location till when we
		// have searched our element . yes below is correct but if break condition is not required.
		
		//if(i<j)
		//{
			while(i<=j )
			{
				 i = (int) (Math.random()*(max-min+1));
				 if(i>j)
					 break;
			}
	
	//	}
		//System.out.println("index genrated is"+i);
		int num = a[i];
		//int j=0;
		//a[min]=num;
		a[i]=a[++j];
		//System.out.println("valie od int j"+j);
		return num;
		
	}

}
