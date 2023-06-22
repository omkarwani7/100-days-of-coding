import java.util.*;
public class LLMiddle{
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

    public void getMiddle(){
        Node hare = head;
        Node turtle = head;
        while(hare.next != null && hare.next.next != null){
            hare = hare.next.next;
            turtle = turtle.next;
        }
        // return turtle;
        System.out.println(turtle.data);
    }
    public static void main(String[] args){
        LLMiddle list = new LLMiddle();
        list.addAtBeginning(6);
        list.addAtBeginning(5);
        list.addAtBeginning(4);
        list.addAtBeginning(3);
        list.addAtBeginning(2);
        list.display();
        list.getMiddle();
    }

}