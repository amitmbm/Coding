package DS;

/*
 * need to check what is the question here
 */
public class HousingPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n=36;
       int flag=0,i=2;
     //  int jcnt=2,kcnt=2;
       int res= (int) Math.sqrt(n);
       while(i <=res)
       {
    	 if(n%i==0)
    	 {
    		 int div=i*i;
    		 while(div<n)
    			 div=div*i;
    		 if(div==n){
    			 flag=1;
    			 System.out.println("print base"+i);
    		     break;
    		 }
    			
    	 }
    	 i++;
       }
       
      if(flag ==1)
    	  System.out.println("true");
      else
    	  System.out.println("false");
	}

}
