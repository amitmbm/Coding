package DS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Astronut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 //System.out.println("Name: ");
		  try{
		     BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
		     String inputString = bufferRead.readLine();
		      String arr[] = inputString.split(" ");
		     System.out.println("N entered : " + arr[0] + "I entered"+ arr[1]);
		     int I = Integer.parseInt(arr[1]);
		     int N = Integer.parseInt(arr[0]);
		     int []a = new int[N];
		     int []flag = new int[N];
		     int [][] ast = new int[I][2]; 
		     int i=0;
		     for(i =0 ; i < N ; i++)
		     {
		    	 a[i]=i;
		     }
		     inputString = bufferRead.readLine();
		     for(i=0 ; i < I ; i++)
		     {
		    	  arr = inputString.split(" ");
		    	   ast[i][0]=Integer.parseInt(arr[0]);
		    	   ast[i][1] = Integer.parseInt(arr[1]);
		    	   System.out.println("first"+ast[i][0]+"second"+ast[i][1]);
		    	   if(flag[ast[i][0]]!= 2 )
		    		   flag[ast[i][0]]=flag[ast[i][0]]+1;
		    	   if(a[ast[i][1]]!= 2 )
		    		   flag[ast[i][1]]=flag[ast[i][1]]+1;
		    	   inputString = bufferRead.readLine();
		    	   
		     }
		     
		     System.out.println("printing the frequency");
		     for( i =0 ; i < N ; i++)
		     {
		    	 System.out.println(flag[i]);
		     }
		     for(i=0 ; i < I ; i++)
		     {
		    	  	   if(ast[i][0]==1 && ast[i][1]==2 )
		    		     flag[ast[i][0]]=2;
		    	   if(a[ast[i][1]]== 1 && ast[i][0]==2 )
		    		   flag[ast[i][1]]=2;
		    	//   inputString = bufferRead.readLine();
		    	   
		     }
		     for( i =0 ; i < N ; i++)
		     {
		    	 System.out.println(flag[i]);
		     }
		    // System.out.println("printing the ip ast");
		     
		 }
		 catch(IOException ex)
		 {
		    ex.printStackTrace();
		 }
		  
	}

}