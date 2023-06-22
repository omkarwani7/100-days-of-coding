import java.util.*;
public class LLDelNFromEnd{
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
    public Node deleteNFromEnd(int n){
        if(head.next == null){
            return null;
        }
        int size = 0;
        Node curr = head;
        while(curr != null){
            curr = curr.next;
            size++;
        }
        if(size == n){
            return head.next;
        }
        int itf = size - n;
        Node prev = head;
        int i=1;
        while(i != itf){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LLDelNFromEnd list = new LLDelNFromEnd();
        list.addAtBeginning(6);
        list.addAtBeginning(5);
        list.addAtBeginning(4);
        list.addAtBeginning(3);
        list.addAtBeginning(2);
        list.addAtBeginning(1);
        list.display();
        int n = 4;
        list.deleteNFromEnd(n);
        list.display();
    }

}