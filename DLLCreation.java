import java.util.*;
public class DLLCreation{
    class Node{
        int data;
        Node previous;
        Node next;  
        Node(int data){
            this.data = data;
        }
    }
    Node head, tail = null;

    public void addNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            head.previous = null;
            tail.next = null;
        }else{
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
        }
    }

    public void display(){
        Node current = head;
        if(head == null){
            return;
        }
        System.out.println();
        while(current != null){
            System.out.println(current.data+" ");
            current = current.next;
        }
    }
    public static void main(String[] args){
        DLLCreation list = new DLLCreation();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.display();

    }

}