import java.util.*;
public class SinglyLinkedList{
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

    public void addNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
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
        SinglyLinkedList list = new SinglyLinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.display();
    }

}