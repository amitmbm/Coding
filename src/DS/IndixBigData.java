package DS;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class IndixBigData {

	public static void main(String args[]) throws Exception 
	{
	       /* getting the input according to the test case */
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String line = br.readLine();
	        String[] str =line.split(" "); 
	        int lowest_channel = Integer.parseInt(str[0]);
	        int highest_channel = Integer.parseInt(str[1]);
	        /*System.out.print("lowest channel is"+ lowest_channel);
	        System.out.print("highest channel is"+ highest_channel);*/
	        line = br.readLine();
	        str =line.split(" "); 
	        int blocked_channel_no = Integer.parseInt(str[0]);
	        int arr_block[] = new int[blocked_channel_no];
	        for(int i=0;i< blocked_channel_no;i++)
	        {
	        arr_block[i] = Integer.parseInt(str[i+1]);
	        // System.out.print("block channel is"+ arr_block[i]);
	        }
	        line = br.readLine();
	        str =line.split(" "); 
	        int channel_no = Integer.parseInt(str[0]);
	        int arr_channel[] = new int[channel_no];
	        for(int i=0;i< channel_no;i++)
	        {
	        arr_channel[i] = Integer.parseInt(str[i+1]);
	        //System.out.print("watch channel is"+ arr_channel[i]);
	        }
	        
	        /* below is the unit test cases */
	        if(lowest_channel <=0 || lowest_channel > 10000)
	        {
	        	System.out.print("invalid lowest channel number");
	        	System.exit(1);
	        }
	        if(highest_channel <=0 || highest_channel > 10000 || highest_channel < lowest_channel)
	        {
	        	System.out.print("invalid highest channel number");
	        	System.exit(1);
	        }
	        
	        if(blocked_channel_no > 40 )
	        {
	        	System.out.print("invalid number of blocked channel");
	        	System.exit(1);
	        }
	        /* sorting the blocked channel list */
	        Arrays.sort(arr_block);
	        if( ( blocked_channel_no> 0 && arr_block[0] < lowest_channel) ||( blocked_channel_no> 0 && arr_block[arr_block.length-1] > highest_channel))
	        {
	        	System.out.print("invalid input of blocked channel");
	        	System.exit(1);
	        }
	        if(channel_no > 50 || channel_no <=0)
	        {
	        	System.out.print("invalid number of watch channel");
	        	System.exit(1);
	        }
	        
	        /* main-logic */
	        int cur_chan=0,back_chan=0,diff=0,length=0,total_cnt=0,prev_chan=0,cnt=0,last=0,tmp_chan=0,min_hit=0;
	        int flag=1;
	        if(blocked_channel_no> 0)
	        {
	        last=arr_block[blocked_channel_no-1];
	        }
	        /* first time count of channel */
	        cur_chan = arr_channel[0];
	        length=digit(cur_chan);
	        total_cnt=length;
	        prev_chan=cur_chan;
	        //System.out.println("total number of channel"+arr_channel.length);
	        for(int i=1;i< arr_channel.length ; i++)
	        {
	        	cur_chan=arr_channel[i];
	        	System.out.println("curr is"+cur_chan+"prev is"+ prev_chan+"back is"+ back_chan);
	        	/* checking if current channel is equal to back channel */
	        	if(cur_chan == back_chan)
	        	{
	        		back_chan=prev_chan;
	        		prev_chan=cur_chan;
	        		total_cnt= total_cnt+ 1;
	        		System.out.println("inside the back buttion case");
	        		
	        	}
	        	else if(cur_chan == prev_chan)
	        	{
	        		back_chan=prev_chan;
	        		prev_chan=cur_chan; 
	        		System.out.println("inside the same buttion case");
	        	}
	        	else
	        	{
	        	length=digit(cur_chan);
	        	//System.out.println("digit in number is"+length);
	        	//diff = fnDiff(cur_chan,back_chan);
	        	diff = fnDiff(cur_chan,prev_chan);
	        	if(diff < (40+length))
	        	{
	        		//System.out.println("inside main condition");
	        	  if(prev_chan < last )
	        	  {
	        		  //System.out.println("inside nested if condition");
	        		  tmp_chan=prev_chan +1;
	        		  cnt=0;
	        		
	        		  while(tmp_chan != (cur_chan-1))
	        		  {
	        			  System.out.println("searching result is "+Arrays.binarySearch(arr_block,tmp_chan));
	        			  
	        			  if(Arrays.binarySearch(arr_block,tmp_chan) < 0)
	        			  {
	        				  System.out.println("inside the array search miss condition");
	        				  cnt=cnt +1;
	        			  }
	        			  if(cnt >= length-1)
	        			  {
	        				  System.out.println("inside the breaking for curr is"+cur_chan);
	        				  flag=1;
	        				  break;
	        			  }
	        			  tmp_chan=tmp_chan +1;
	        		  }
	        		  
	        	  }
	        	}
	        	if(tmp_chan == cur_chan-1)
	        	{
	        		System.out.println("for curr is using the flag============0"+cur_chan);
	        		System.out.println("value of cnt is"+cnt);
	        		if(cnt == 0)
	        			cnt=1;
	        	min_hit=length;
	        	if(cnt < min_hit)
	        		min_hit=cnt;
	        	if(diff < min_hit)
	        		min_hit=diff;
	        	total_cnt= total_cnt+ min_hit;
	        	}
	        	else 
	        	{
	        		System.out.println("for curr is"+cur_chan);
	        		if(diff > length)
		        		total_cnt= total_cnt+ length;
		        	else
		        		total_cnt= total_cnt+ diff;	
	        	}
	        	/* */
	        	
	        	
	        	
	        	
	        	/* assign the prev and back channel */
	        	back_chan=prev_chan;
	        	prev_chan=cur_chan;
	        	if(cur_chan == 100)
	        	{
	        		System.out.println("inside the main condition");
	        		System.out.println("==========prev is"+ prev_chan+"back is"+ back_chan);
	        	}
	        	
	        }
	        }
	        
	        System.out.println("total hits required is "+total_cnt);
	        
	        
	  }
	 
	 static int digit(int number)
	 {
		 return (String.valueOf(number).length());
	 }
	 static int fnDiff(int cur, int back)
	 {
		 int diff = Math.abs(cur-back);
		 if(diff > 1)
			 return (diff+1);
		 else
			 return diff;
		  
	 }
}

