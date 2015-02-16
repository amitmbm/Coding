package DS;

class Node
{
	public int data;
	public Node next;
	
	public Node(int data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
}

public class LinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// first LL
		Node h1 = new Node(5,null);
		Node h2 = new Node(10,null);
		Node h3 = new Node(15,null);
		Node h4 = new Node(20,null);
		Node h5 = new Node(25,null);
		Node h6 = new Node(30,null);
		
		h1.next = h2;
		h2.next = h3;
		h3.next = h4;
		h4.next = h5;
		h5.next = h6;
		
		// second LL
				Node l1 = new Node(25,null);
				Node l2 = new Node(30,null);
				
				l1.next=l2;
				l2.next=h6;
				
				int cnt=0;
				Node tmp=h1;
				while(tmp!=null)
				{
					cnt++;
					tmp=tmp.next;
				}
				System.out.println("size of first LL"+cnt);
		
				int cnt1=0;
				tmp=l1;
				while(tmp!=null)
				{
					cnt1++;
					tmp=tmp.next;
				}
				System.out.println("size of second LL"+cnt1);
				int d;
				int flag=0;
				if(cnt> cnt1)
					d= cnt - cnt1;
				else
				{
					d= cnt1 - cnt;
					flag=1;
				}
					
				Node ptr1=h1;
				Node ptr2=l1;
				if(flag == 0)
				for(int i =0 ; i < d ; i++)
				{
					ptr1=ptr1.next;
				}
				else
				{
					for(int i =0 ; i < d ; i++)
					{
						ptr2=ptr2.next;
					}
				}
				
				while(ptr1 != ptr2)
				{
					ptr1=ptr1.next;
					ptr2=ptr2.next;
				}
				
				System.out.println("intersection point found and element at that point is" + ptr1.data);
					
				
				
			  
	}

}
