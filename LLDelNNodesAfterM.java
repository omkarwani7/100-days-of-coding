import java.util.*;
public class LLDelNNodesAfterM{
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
    public Node delete(Node head,int m,int n){
        // ip - 12345678  op - 1256
        Node curr = head;
        int count;
        while(curr!=null){
            for(count=1;count<m && curr!=null;count++){
                curr = curr.next;
                }    
                if(curr == null){
                    return head;
                }
                Node temp = curr.next;
                for(count=1;count<=n && temp!=null;count++){
                    temp=temp.next;
                }
                curr.next = temp;
                curr = temp;
        }
        return head;
    }
    public static void main(String[] args){
        LLDelNNodesAfterM list = new LLDelNNodesAfterM();
        list.addAtBeginning(8);
        list.addAtBeginning(7);
        list.addAtBeginning(6);
        list.addAtBeginning(5);
        list.addAtBeginning(4);
        list.addAtBeginning(3);
        list.addAtBeginning(2);
        list.addAtBeginning(1);
        list.display();
        int n = 2;
        int m = 2;
        list.delete(head,m,n);
        list.display();
    }

}