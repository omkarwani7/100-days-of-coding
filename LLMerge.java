import java.util.*;
class Node {
	int data;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}

class MergeLists {
	Node head;
	public void addToTheLast(Node node)
	{
		if (head == null) {
			head = node;
		}
		else {
			Node temp = head;
			while (temp.next != null)
				temp = temp.next;
			temp.next = node;
		}
	}
	void printList()
	{
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
    }
	public static void main(String args[])
	{
		
		MergeLists llist1 = new MergeLists();
		MergeLists llist2 = new MergeLists();
		llist1.addToTheLast(new Node(1));
		llist1.addToTheLast(new Node(3));
		llist1.addToTheLast(new Node(5));
		llist1.printList();
		llist2.addToTheLast(new Node(2));
		llist2.addToTheLast(new Node(4));
		llist2.addToTheLast(new Node(6));
		llist2.printList();

		llist1.head = new LLMerge().sortedMerge(llist1.head,
											llist2.head);
		llist1.printList();
	}
}
// 1 3 5
// 2 4 6
class LLMerge {
	public Node sortedMerge(Node head1, Node head2)
	{
		if (head1 == null)
			return head2;
		if (head2 == null)
			return head1;

		if (head1.data < head2.data) {
			head1.next = sortedMerge(head1.next, head2);
			return head1;
		}
		else {
			head2.next = sortedMerge(head1, head2.next);
			return head2;
		}
	}
}


