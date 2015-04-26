/* IMPORTANT: class must not be public. */

/*
 * uncomment this if you want to read input. */

/*
 * sample test case 
 * 3
5
1 2 1 2
1 0 2 1
3
1 6  and op 6,10,7
4 8
3
1 2
6 5


 */
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class RoyAndRopes {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int T = Integer.parseInt(line);
        int N=0;
        int u[] ;//= new int[N-1];
        int l[] ;//=new int [N-1];
        int le[];
        int t=0;
        while(t < T)
        {
        line = br.readLine();  
        N = Integer.parseInt(line);
        u=new int[N-1];
        l=new int[N-1];
        le=new int[N-1];
        line = br.readLine();  
        String s[]= line.split(" ");
        for(int i = 0; i < s.length; i++) 
           u[i] = Integer.parseInt(s[i]);
           
         s= br.readLine().split(" ");
         for(int i = 0; i < s.length; i++) 
           l[i] = Integer.parseInt(s[i]);
           
         for(int i = 0; i < s.length; i++)
         {
         	l[i] = Math.max(u[i],l[i]);
         	//System.out.println("m"+l[i]);
         }
         
        int max=l[0];
        int mi=0;
        for(int i=0;i<N-1;i++)
        {
        	if(l[i]>=max)
        	  {
        	  	max=l[i];
        	  	mi=i;
        	  }
        }
       // if(mi)
        System.out.println(max+mi+1);
        t++;
        }
        
        

        //System.out.println("Hello World!");
    }
}
