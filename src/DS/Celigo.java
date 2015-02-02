package DS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Celigo {
	
	public static void main(String args[])
	{
		List<Integer> list1 = new ArrayList<Integer>() ;
		list1.add(1);
		list1.add(0);
		list1.add(-10);
		list1.add(-25);
		list1.add(20);
		list1.add(1000);
		list1.add(78);
		list1.add(1000);
		list1.add(-45);
		
		List<Integer> list2 = new ArrayList<Integer>() ;
		list2.add(-7);
		list2.add(10);
		list2.add(-100);
		list2.add(-250);
		list2.add(200);
		list2.add(100);
		list2.add(-78);
		list2.add(100);
		list2.add(45);
		
		findCommonLargest(list1,list2);
		//{ 1,0,-10,-25,20,100,78,100,-45};
		
	}

	public static void findCommonLargest(List<Integer> list1, List<Integer> list2)
	{
		int largestInt=0,flag=0;
		int item1=0,item2=0;
	    /* sorting the both list ,Sorting O(mlogm)+O(nlogn)*/
		Collections.sort(list1);
		Collections.sort(list2);
        /* from last checking the common element in both the list and here in worst case O(m+n) 
         As we might have to travel till the first element of both the lists */
		for(int i=list1.size()-1,j=list2.size()-1;i>=0&&j>=0;)
		{
			    item1=list1.get(i);
		    	item2=list2.get(j);
				if(item2 > item1)
					j--;
				else if(item2 < item1)
					i--;
				else 
				{
					largestInt=item2;
					flag=1;
					break;
				}
		}
		if(flag ==0)
			System.out.println("No largest common integer is present in both the list");
		else
		System.out.println("largest common integer is"+largestInt);
	}
}
