package DS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class CoupansDS2 {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
          try{
		     BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
              int N = Integer.parseInt(bufferRead.readLine());
                String inputString = null;
              
              int arr[] = new int[N];
              int in=-1;
               String sa[] = null; 
		   //  System.out.println("N : " + arr[0] + "M"+ arr[1]);
              int k=0,l=0,m=0;
              for(int i=0;i<N;i++)
                  {
                  inputString = bufferRead.readLine();
                  sa = inputString.split(" ");
                  if(sa.length == 1)
                      {
                      if(in==0)
                          {
                           System.out.println("EMPTY");
                          in=-1;
                      }
                         
                      else
                          System.out.println(arr[--in]);
                  }
                  else if(sa.length == 2)
                      {
                      arr[++in]=Integer.parseInt(sa[1]);
                      System.out.println(arr[in]);
                  }
                  else
                      {
                      l=Integer.parseInt(sa[1]);
                      m=Integer.parseInt(sa[2]);
                      k=0;
                      while(k < l)
                          {
                          arr[k]=arr[k]+m;
                          k++;
                      }
                       System.out.println(arr[in]);
                  }
                  
              }
		   
		     
		 }
		 catch(IOException ex)
		 {
		    ex.printStackTrace();
		 }
    }
}