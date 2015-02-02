package DS;

import java.util.LinkedList;

public class LinkListTest {

	public static void main(String args[])
	{
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Amit");
		ll.add("guddu");
		ll.add(2, "mine at 5 pos");
		
		

		String x= ll.remove();
		System.out.println("item is"+ x);

		String y= ll.getLast();
		System.out.println("item is"+ y);
		
		System.out.println(ll);
		/*Iterator itr =  ll.iterator();
		while(itr.hasNext())
		{
			System.out.println("item is"+itr.next());
		}*/
	}
}
