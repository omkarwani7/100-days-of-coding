import java.util.*;
public class MergeLists{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public Node head = null;
    public Node tail = null;

    public void addAtBeginning(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }
    public void display(){
        Node current = head;
        if(head == null){
            return;
        }
        while(current!=null){
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }
    public Node merge(Node head1,Node head2){
        if (head1 == null)
			return head2;
		if (head2 == null)
			return head1;

		if (head1.data < head2.data) {
			head1.next = merge(head1.next, head2);
			return head1;
		}
		else {
			head2.next = merge(head1, head2.next);
			return head2;
		}
    }
    public static void main(String[] args){
        MergeLists list1 = new MergeLists();
        MergeLists list2 = new MergeLists();
        list1.addAtBeginning(5);
        list1.addAtBeginning(3);
        list1.addAtBeginning(1);
        list1.display();
        list2.addAtBeginning(6);
        list2.addAtBeginning(4);
        list2.addAtBeginning(2);
        list2.display();
        list1.merge(list1.head,list2.head);
    }

}