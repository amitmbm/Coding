import java.util.Arrays;



public class LoadBalance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[] = {0,0,15,0,0,0,0,0,0,0};
      int sum=0;
      for(int i=0;i<a.length;i++)
    	  sum+=a[i];
      
      int low = (int) Math.floor(sum/a.length);
      int high = (int) Math.ceil(sum/a.length);
      System.out.println(""+Math.ceil(sum/a.length));
      System.out.println("low"+low+"h"+high);
      
      int low_cnt=0,high_cnt=0;
      int sec_cnt=0;
      high=2;
      /*if(low == high)
    	  low_cnt=high_cnt=(a.length)/2;*/
      while( sec_cnt < 10 && (low_cnt !=5 || high_cnt !=5) )
      {
    	  System.out.println("array before loop"+ Arrays.toString(a));
    	  for(int i=0;i<a.length;i++)
    	  {
    		  if(i==0 && a[i]>a[i+1] && a[i]>low+1)
    		  {
    			  a[i]-=1;
    			  a[i+1]+=1;
    			  //System.out.println("first"+i);
    			  
    		  }
    		  else if(i==a.length-1 && a[i]>a[i-1] && a[i]>low+1)
    		  {
    			  a[i]-=1;
    			  a[i-1]+=1;
    			  //System.out.println("last"+i);
    		  }
    		  else
    		  {
    			  if(i>0 && a[i] > a[i-1] && (a[i]>=(low+2))){
    			 // if(i>0 && a[i] > a[i-1] && (a[i-1]<high)){
    				  a[i]-=1;
        			  a[i-1]+=1;
        			  //System.out.println("left"+i);
    			  }
    			  if(i < (a.length-1) && a[i] > a[i+1]){
    				  a[i]-=1;
        			  a[i+1]+=1;
        			//  System.out.println("right"+i);
    			  }
    			  
    		  }
    		 
    		      		 
    	  }
    	  System.out.println("array After loop"+ Arrays.toString(a));
    	  low_cnt=0;
    	  high_cnt=0;
    	  for(int i=0;i<a.length;i++)
    	  {
    		  if(low == high)
    		  {
    			  if(a[i] == low)
        			  low_cnt++;
        		  else
        			  continue;
    		  }
    		  else
    		  {
    			  if(a[i] == low)
        			  low_cnt++;
        		  else if(a[i] ==high)
        			  high_cnt++;
        		  else
        			  continue;
    		  }
    		  
    		
    	  }
    	 // System.out.println("after ith"+sec_cnt+"loop value of low"+low_cnt+"high"+high_cnt);
    	  System.out.println("l and h cnt"+ low_cnt+"high"+high_cnt);
    	  sec_cnt++;
      }
      System.out.println(""+sec_cnt);
	}

}
