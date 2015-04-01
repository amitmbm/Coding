
/*
 * this ques contains two array ,which are sorted and we need to find a sum , 
 * from which number's will be present from both the array
 */
public class NutanixArray {

	public static void main(String[] args) {
		
		int a1[] = {1,2,5,8,9,15};
		int a2[]=  {4,7,12,16,14};
		
		int sum=19;
		fn(a1,a2,19);// 15 and 4
		fn(a1,a2,15); // 8 and 7
		fn(a1,a2,17); // 5 and 12
		fn(a1,a2,12); // 8 and 4
		fn(a1,a2,2); // not found
		fn(a1,a2,30); // not found
		
		
	}
	
	static void fn(int arr1[] , int arr2[],int num)
	{
	  int i=arr1.length-1,j=0,flag=0;
	  while(i>=0 && j<arr2.length)
	  {
	    if((arr1[i]+arr2[j])==num){
	        System.out.println("number combination found and number1 is ::"+arr1[i]+"and number2 is::"+arr2[j]);
	        flag=1;
	        break;
	    }
	    else if((arr1[i]+arr2[j])>num)
	       i--;
	    else
	     j++;    
	  }
	  if(flag ==0)
	  System.out.println("number combination not found");
	}

}
