
/*
 *  Each day, you can either buy one share of WOT, sell any number of shares of WOT that you own,
 *  or not make any transaction at all. What is the maximum profit you can
 *  obtain with an optimum trading strategy?
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StockMaximize {
 
 public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line); 
        for(int k=0;k<N;k++)
         {    
              line =br.readLine();
              line =br.readLine();
              
              String[] s =line.split(" "); 
              int[] parts = new int[s.length];
              /* creating the integer array */
              for(int i = 0;i < s.length;i++)
              {
                 parts[i] = Integer.parseInt(s[i]);
                    // System.out.print("array is"+ parts[i]);
              }
            
              int max=parts[parts.length -1] ;
              long profit = 0;
              for(int i= parts.length -2; i>=0; i--)
                {
                 if(parts[i] <= max)
                    {
                            
                     profit = profit + (max - parts[i]);
                  }
                else
                  {
                      max=parts[i];
                }
                
              }
              System.out.println(profit);
           
         }
 }
}