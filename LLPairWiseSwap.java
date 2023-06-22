import java.util.*;
public class LLPairWiseSwap{
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

    public void pairWiseSwap(){
        Node temp = head;
        while(temp != null && temp.next != null){
            int a = temp.data;
            temp.data = temp.next.data;
            temp.next.data = a;
            temp = temp.next.next;
        }
    }
    public static void main(String[] args){
        LLPairWiseSwap list = new LLPairWiseSwap();
        list.addAtBeginning(30);
        list.addAtBeginning(20);
        list.addAtBeginning(20);
        list.addAtBeginning(10);
        list.display();
        list.pairWiseSwap();
        list.display();
    }

}