package DS;

/*
Please write complete compilable code.
Your class should be named Solution
Read input from standard input (STDIN) and print output to standard output(STDOUT).
For more details, please check https://www.interviewstreet.com/recruit/challenges/faq/view#stdio
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ZenefitsUS {

	public static void main(String[] args) {
		  try{
		     BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
		      String arr[] = bufferRead.readLine().split(" ");
              int N = Integer.parseInt(arr[0]);
              int M = Integer.parseInt(arr[1]);
              int s[][] = new int [N][2];
              int q[]= new int[M];
              //System.out.println("N" + arr[0] + "M"+ arr[1]);
              for(int i=0;i<N;i++)
                  {
                 arr= bufferRead.readLine().split(" ");
                  s[i][0]=Integer.parseInt(arr[0]);
                   s[i][1]=Integer.parseInt(arr[1]);
                //   System.out.println(":"+s[i][0]+"va"+s[i][1]);
              }
              int cnt;
              for(int i=0;i<M;i++)
                  {
                // arr= bufferRead.readLine();
                  q[i]=Integer.parseInt(bufferRead.readLine());
                  // System.out.println(":"+q[i]);
                  cnt=0;
                 for(int j=0;j<N;j++)
                  {
                       if(q[i] < s[j][0])
                          continue;
                       else if(q[i] > s[j][1])
                          continue;
                        else
                           cnt++;
              }
                  System.out.println(cnt);
              }
		     //System.out.println("Name entered : " + arr[0] + "surname"+ arr[1]);
		 }
		 catch(IOException ex)
		 {
		    ex.printStackTrace();
		 }
		  
	}

}
