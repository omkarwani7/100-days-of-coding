import java.util.*;
public class LLReverseNodesInKGroups{
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
    public Node reverseKGroup(Node head,int k){
        Node temp = head;
        for(int i=1;i<=k;i++){
            if(temp == null){
                return head;
            }
            temp = temp.next;
            Node nextgroup = reverseKGroup(temp,k);
            Node prev = null;
            Node curr = head;
            for(i=1;i<=k;i++){
                Node next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            head.next = nextgroup;
            return prev;
        }
    }
    public static void main(String[] args){
        LLReverseNodesInKGroups list = new LLReverseNodesInKGroups();
        list.addAtBeginning(5);
        list.addAtBeginning(4);
        list.addAtBeginning(3);
        list.addAtBeginning(2);
        list.addAtBeginning(1);
        list.display();
        int k = 2;
        list.reverseKGroup(head,k);
    }

}