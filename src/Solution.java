import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line); 
        //System.out.println("total element is"+N);
		int num=0;
		long a[] = new long[N];
        long b[]= new long[N];
        int cnt=0;
		long prev=0;
		long sum=0;
		/* below is used to create integer Array */
		for(int k=0;k<N;k++)
		{    
			line =br.readLine();  
			num = Integer.parseInt(line);  
			a[cnt++] = num;
		}
		int i=0;
		long min=a[i];
		int index=0;
		/* to get the minimum rank index in array */
		for(i=1;i< a.length;i++)
		{    
			if(a[i] <= min){
				min=a[i];index=i;
			}
		}
		int ind=index;
		int in=index;
        prev=1;
        b[index]=prev;
		long mprev=1;
        // System.out.println("mprev is"+ mprev);
		index--;
		/* first while loop for left side */
		while(index >=0)
		{
			if(a[index]>a[index+1])
			{
				prev=prev+1;
                
			}
			else
			{

				prev=1;
			}
           
			//sum=sum+prev;
             b[index]=prev;
			index--;
		}
		ind++;
		/* second while loop for right side */
		while(ind < a.length)
		{
			if(a[ind]>a[ind-1])
			{
				if(ind-1 == in)
					prev=mprev+1;
				else
					prev=prev+1;
			}
			else
			{

				prev=1;
			}
			//sum=sum+prev;
            b[ind]=prev;
			ind++;
		}
        for(i=1;i<a.length;i++)
            {
		//System.out.println(b[bcnt]+"\t");
            if(a[i]>a[i-1] && b[i]<=b[i-1])
                {
                b[i]=b[i-1]+1;
            }
        }
        for(i=a.length-2;i>=0;i--)
            {
		//System.out.println(b[bcnt]+"\t");
            if(a[i]>a[i+1] && b[i]<=b[i+1])
                {
                b[i]=b[i+1]+1;
            }
        }
        sum=0;
        for(i=0;i<a.length;i++)
            {
		    sum=sum+b[i];
        }
     System.out.println(sum);
	}
}