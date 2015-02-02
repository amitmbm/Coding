package DS;


/* Anagram challenge */
public class StrShift {
	 public static void  arr(String str1 , String str2)
	    {

			int i1[]=new int[26];
	    	int i2[]=new int[26];
	   
	    	for (int k=0; k < str1.length(); k++){
	         
	                i1[str1.charAt(k)%97]=i1[str1.charAt(k)%97]+1;
	                i2[str2.charAt(k)%97]=i2[str2.charAt(k)%97]+1;
	  
	        }

	    	
	    	int sum=0;
	    	for(int l=0;l<26;l++)
	    	{
	    		if(i2[l]>i1[l])
	    		{
	    			sum=sum+(i2[l]-i1[l]);
	    		}
	    	
	    	}
	    	System.out.println(sum);
	    
	}

 public static void main(String[] args) throws Exception {
      

                arr("abcdef","ghijkl");  
  
}
}