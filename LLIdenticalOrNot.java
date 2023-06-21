import java.util.*;
import java.io.*;
public class LLIdenticalOrNot{
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
    public boolean isIdentical(LLIdenticalOrNot listb){
        Node a = this.head, b = listb.head;
        while(a!=null && b!=null){
            if(a.data!=b.data){
                return false;
            }
            a=a.next;
            b=b.next;
        }
        return (a==null && b==null);
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
        LLIdenticalOrNot list1 = new LLIdenticalOrNot();
        LLIdenticalOrNot list2 = new LLIdenticalOrNot();
        list1.addAtBeginning(3);
        list1.addAtBeginning(2);
        list1.addAtBeginning(1);
        list1.display();

        list2.addAtBeginning(3);
        list2.addAtBeginning(2);
        list2.addAtBeginning(1);
        list2.display();

        if(list1.isIdentical(list2) == true){
            System.out.println("Identical");
        }else{
            System.out.println("Not identical");
        }
    }
}