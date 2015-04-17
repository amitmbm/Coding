/*class LinkListNode {
	int data;
	LinkListNode next;

	public LinkListNode(int data, LinkListNode next) {
		super();
		this.data = data;
		this.next = next;
	}

	public static void printLinkListNode(LinkListNode head) {
		while (head != nuLinkListNode) {
			System.out.println(" " + head.data);
			head = head.next;
		}

	}

	public static LinkListNode reverse(LinkListNode h, LinkListNode t) {
		if (h == nuLinkListNode && t != nuLinkListNode)
			return t;
		if (h == nuLinkListNode && t == nuLinkListNode)
			return nuLinkListNode;
		if (t == nuLinkListNode && h != nuLinkListNode) {
			t = h;
			h = h.next;
			t.next = nuLinkListNode;
		} else {
			LinkListNode t2 = nuLinkListNode;
			t2 = t;
			t = h;
			h = h.next;
			t.next = t2;
		}
		return reverse(h, t);
	}
}*/

public class ReverseLLRecursive {

	public static void main(String[] args) {
		LinkListNode l4 = new LinkListNode(20, null);
		LinkListNode l3 = new LinkListNode(15, l4);
		LinkListNode l2 = new LinkListNode(10, l3);
		LinkListNode l1 = new LinkListNode(5, l2);
		LinkListNode head = l1;
		LinkListNode.printLL(head);
		LinkListNode rev = ReverseLLRecursive.reverse(head, null);
		System.out.println("After reversing the LinkListNode");
		LinkListNode.printLL(rev);

	}

	
	public static LinkListNode reverse(LinkListNode h, LinkListNode t) {
		if (h == null && t != null)
			return t;
		if (h == null && t == null)
			return null;
		if (t == null && h != null) {
			t = h;
			h = h.next;
			t.next = null;
		} else {
			LinkListNode t2 = null;
			t2 = t;
			t = h;
			h = h.next;
			t.next = t2;
		}
		return reverse(h, t);
	}
}
