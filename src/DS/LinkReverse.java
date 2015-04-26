package DS;

/*
 * This will reverse the LL using the recurseion , but not the working solution
 * Another code i have written which was asked in VMware.
 */



public class LinkReverse {

	static LLNode ori=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LLNode head= new LLNode(1);
		LLNode headnext= new LLNode(2);
		LLNode headnnext= new LLNode(3);
		head.next=headnext;
		headnext.next=headnnext;
		printLL(head);
		//
		LLNode newHead=reverseLL(head);
		System.out.println("reverse LL is ");
		printLL(newHead);
		

	}

	static void printLL(LLNode head)
	{
		while(head!=null){
			System.out.println(""+ head.data);
		head=head.next;
		}
	}
	
	static LLNode reverseLL(LLNode head)
	{
		LLNode p=head;
		LLNode c=null;
		
		if(head==null || head.next==null){
			if(head!=null){
				 ori=head;
				 //return ori;
			}
			
		}
		
		reverseLL(head.next);
		c.next=p;
		return ori;
	}
}
