import java.util.*;
public class LLInsertBeginning{
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
            // Node temp = head;
            // head = newNode;
            // head.next = temp;
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
    public static void main(String[] args){
        LLInsertBeginning list = new LLInsertBeginning();
        list.addAtBeginning(1);
        list.addAtBeginning(2);
        list.addAtBeginning(3);
        list.display();
    }

}