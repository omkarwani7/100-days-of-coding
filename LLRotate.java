import java.util.*;
public class LLRotate{
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

    void rotate(int k){
        if (k == 0)
            return;
 
        Node current = head;   
        int count = 1;
        while (count < k && current != null)
        {
            current = current.next;
            count++;
        }
        
        if (current == null)
            return;

        int size = 0;
        Node curr = head;
        while(curr != null){
            curr = curr.next;
            size++;
        }
        int itf = size - k;
        Node prev = head;
        int i=1;
        while(i != itf){
            prev = prev.next;
            i++;
        }
       
        Node kthNode = prev;
        
        while (current.next != null)
            current = current.next;
 
        current.next = head;      
        head = kthNode.next;       
        kthNode.next = null;
    }
 
   
    void push(int new_data)
    {
        
        Node new_node = new Node(new_data);
 
       
        new_node.next = head;
 
      
        head = new_node;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LLRotate list = new LLRotate();
        list.addAtBeginning(6);
        list.addAtBeginning(5);
        list.addAtBeginning(4);
        list.addAtBeginning(3);
        list.addAtBeginning(2);
        list.addAtBeginning(1);
        list.display();
        int n = 3;
        list.rotate(n);
        list.display();
    }

}