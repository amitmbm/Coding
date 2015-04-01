

/*
 *  Each day, you can either buy one share of and sell 1 number of shares.
 *  you need to determine the day on which you must buy and sell to make maximum benefit
 *  coupandunia interview code , check by giving below ip
 * no of test 1
  // total number 7
  // Acutual numbers 70 72 73 78 79 74 77
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OneStockMax {
 
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
                     if((max - parts[i]) > profit)       
                     profit = (max - parts[i]);
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