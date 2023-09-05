import java.util.*;
public class LLDetectAndRemoveLoop{
	static Node head;
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data =data;
			this.next =null;
		}
	}

	void detectAndRemoveLoop(Node node){
		if (node == null || node.next == null){
            return;
        }
		Node slow = node, fast = node;

		// Move slow and fast 1 and 2 steps ahead
		slow = slow.next;
		fast = fast.next.next;

		// Search for loop using slow and fast pointers
		while (fast != null && fast.next != null){
			if (slow == fast){
                break;
            }
			slow = slow.next;
			fast = fast.next.next;
		}

		if (slow == fast){
			slow = node;
			if (slow != fast){
				while (slow.next != fast.next){
					slow = slow.next;
					fast = fast.next;
				}
				fast.next = null;
			}
			/* This case is added if fast and slow pointer meet at first position. */
			// else {
			// 	while(fast.next != slow) {
			// 		fast = fast.next;
			// 	}
			// 	fast.next = null;
			// }
		}
	}
	void printList(Node node)
	{
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}
	public static void main(String[] args)
	{
		LLDetectAndRemoveLoop list = new LLDetectAndRemoveLoop();
		list.head = new Node(50);
		list.head.next = new Node(20);
		list.head.next.next = new Node(15);
		list.head.next.next.next = new Node(4);
		list.head.next.next.next.next = new Node(10);

		// Creating a loop for testing
		head.next.next.next.next.next = head.next.next;
        // list.printList(head);

		list.detectAndRemoveLoop(head);
		System.out.println("Linked List after removing loop : ");
		list.printList(head);
	}
}
