
/*
 * this was a coupan dunia ques , solved in Java
 */
public class CompressStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s= "AAAACCDDDAAAAPPBBBBCC";
       int i=0,j=0,k=0,cnt=0;
       StringBuilder sb = new StringBuilder(s);
       System.out.println("len"+sb.length());
       while(i<sb.length())
       {
    	   j=i+1;
    	   cnt=0;
    	   while(j<sb.length() && sb.charAt(i)==sb.charAt(j))
    	   {
    		   j++;cnt++;
    	   }
    	   
    	   if(cnt>=3)
    	   {
    		  
    		   sb.setCharAt(k+2, sb.charAt(i));
    		   sb.setCharAt(k, (char) (cnt+48+1));
    		   sb.setCharAt(k+1, '@');
    		   k=k+3;
    		   i=j;
    	   }
    	   else
    	   {
    		   while(i < sb.length() && k < sb.length() && i<j){
    			   sb.setCharAt(k++, sb.charAt(i));
    			   i++;
    		   }
    		   
    	   }
    	  // i++;
       }
       System.out.println(sb.substring(0, k));
      // System.out.println("shortend str is"+ sb.toString());
	}

}
