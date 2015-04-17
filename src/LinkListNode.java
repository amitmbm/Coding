
public class LinkListNode {

	int data;
	LinkListNode next;

	public LinkListNode(int data, LinkListNode next) {
		super();
		this.data = data;
		this.next = next;
	}

	public static void printLL(LinkListNode head) {
		while (head != null) {
			System.out.println(" " + head.data);
			head = head.next;
		}

	}

}
