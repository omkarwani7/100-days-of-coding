import java.util.*;
public class LLLeftShift{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head = null;
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
    //84256 -- 56842
    // public Node leftShift(Node head){
    //     if(head == null || head.next ==null){
    //         return head;
    //     }
    //     Node curr = head;
    //     // Node prev = head;
    //     while(curr.next.next!=null){
    //         // curr.next.next = prev;
    //         // curr.next = head;
    //         // curr.next.next = head.next;
    //         curr = curr.next;
    //     }
    //     Node prev = curr.next;
    //     curr.next = null;
    //     prev.next = head;
    //     head = prev;
    //     return head;
    // }
    static Node leftShift(Node head, int k) {
    if (head == null || head.next == null){
        return head;
    }
    for (int i = 0; i < k; i++) {
      Node temp = head;
      while (temp.next.next != null){
        temp = temp.next;
      } 
      Node end = temp.next;
      temp.next = null;
      end.next = head;
      head = end;
    }
    return head;
  }
    public static void main(String[] args){
        LLLeftShift list = new LLLeftShift();
        int k = 2;
        list.addAtBeginning(6);
        list.addAtBeginning(5);
        list.addAtBeginning(2);
        list.addAtBeginning(4);
        list.addAtBeginning(8);
        list.display();
        list.leftShift(head,k);
        list.display();
    }

}