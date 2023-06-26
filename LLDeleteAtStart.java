import java.util.*;
public class LLDeleteAtStart{
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
    public void deleteFromStart(){
        if(head == null) {   
            return;  
        } else{
            if(head != tail) {  
                head = head.next;  
            } else{
                head = tail = null; 
            }
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
        LLDeleteAtStart list = new LLDeleteAtStart();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.display();

        while(list.head!=null){
            list.deleteFromStart();
            list.display();
        }
    }

}