import java.util.Arrays;

/*
 * Tis will work for the given and just need to calculate the low_cnt and high_cnt when load is not same accross the servers.
 */

public class LoadBalance15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     // int a[] = {0,0,15,0,0,0,0,0,0,0};
  //    int a[] = {0,0,10,0,0,0,0,0,0,0};
      int a[] = {2,9,1,1};
     // int a[] = {0,70,0,70};
		//int a[]={0,13,0,0};
		//int a[] = {27,28};
      int sum=0;
      for(int i=0;i<a.length;i++)
    	  sum+=a[i];
      
      double dlow = (double)sum/a.length;
      int low = (int) (sum/a.length);
      int low_cnt=0,high_cnt=0 , low_c=0,high_c=0;
      //double high = (int) Math.ceil(sum/a.length);
      
      int high=0;
      int x=0,y=0,z=0;
      System.out.println("d"+dlow+"low"+low);
     
      if(Double.compare(dlow, (double)low)==0)
      {
    	  System.out.println("low==high");
    	  high=low;
    	  low_cnt= a.length;
    	  high_cnt=0;
      }
      else
      {
    	  System.out.println("low!=high");
    	  high=low+1;
    	 // int s= low*low_cnt;
    	 // low_cnt+high_cnt=a.length;
    	  high_cnt= sum-a.length*low;
    	  low_cnt=a.length-high_cnt;
    			  
      }
      /*for(int i=0;i<a.length;i++)
      {
    	  if(a[i] == low)
    		  low_c+=1;
    	  else if(a[i]==high)
    		  high_c+=1;
      }*/
     	  
      //low_cnt=5;high_cnt=5;
      System.out.println("low"+low+"high"+high+"low_cnt"+low_cnt+"high_cnt"+high_cnt);
   
      int sec_cnt=0;
     
      while((low_c!= low_cnt|| high_c != high_cnt) )//|| high_cnt !=5) )
      {
    	 
    	  for(int i=0;i<a.length;i++)
    	  {
    		  if(i==0 && a[i]>a[i+1] )
    		  {
    			  a[i]-=1;
    			  a[i+1]+=1;
    			  
    		  }
    		  else if(i==a.length-1 && a[i]>a[i-1] && a[i]!=low )
    		  {
    			  a[i]-=1;
    			  a[i-1]+=1;
    		  }
    		  else if(i>0 && i< a.length-1)
    		  {
    				if (a[i] > a[i - 1] ) {
						
						if(a[i-1]<high && a[i]!=1){
							a[i - 1] += 1;
							a[i] -= 1;
						}
						if(a[i]==1 && a[i+1] >a[i] && a[i-1]==0)
						{
							a[i - 1] += 1;
							a[i] -= 1;
						}
						if(a[i] > a[i+1] ){
							a[i + 1] += 1;
							a[i] -= 1;
						}
						//a[i + 1] += 1;
					}
					/*else if(a[i] > a[i - 1] && a[i] < a[i + 1])
					{
						a[i]-=1;
	        			  a[i-1]+=1;
					}*/
					else if(a[i] > a[i + 1])
					{
						  a[i]-=1;
	        			  a[i+1]+=1;
					}
					else if(a[i] > a[i - 1] && a[i] > a[i + 1] && a[i]-a[i-1]==1)
					{
						a[i]-=1;
	        			  a[i+1]+=1;
					}
					/*else if(a[i] > a[i - 1] && a[i] > a[i + 1] && a[i] == (low + 1))
					{
						a[i]-=1;
	        			  a[i-1]+=1;
					}*/
    		  }
    		 
    		      		 
    	  }
    	 // System.out.println("array After loop"+ Arrays.toString(a));
    	  System.out.println("array After loop"+ Arrays.toString(a));
    	  low_c=0;
    	  high_c=0;
    	  for(int i=0;i<a.length;i++)
    	  {
    		  if(low == high)
    		  {
    			  if(a[i] == low)
        			  low_c++;
        		 
    		  }
    		  else
    		  {
    			  if(a[i] == low)
        			  low_c++;
        		  else if(a[i] ==high)
        			  high_c++;
        		  
    		  }
    		  
    		
    	  }
    	 // System.out.println("after ith"+sec_cnt+"loop value of low"+low_cnt+"high"+high_cnt);
    	  //System.out.println("l and h cnt"+ low_cnt+"high"+high_cnt);
    	  sec_cnt++;
      }
      System.out.println(""+sec_cnt);
	}

}
