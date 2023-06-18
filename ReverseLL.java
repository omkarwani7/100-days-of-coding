// Q. reverse a linked list ........ https://www.onlinegdb.com/mf8HATsj-

// H.W. Find middle element of LL

import java.util.Scanner;

    // create the node 
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
class LinkedList{
    Node head;
    
    public void addNode( int data){
        Node newNode = new Node(data);
        if(head == null){
            head =newNode;
            
        }else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }
    
    public Node reverseIngroups(Node head, int k){
        Node current = head;
        Node prev = null;
        Node next = null;
        int count = 0;
        
        // reverse the first K nodes
        
        while(count < k && current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }
        
        // recursively reverse the remaining nodes
        if(next != null){
            head.next = reverseIngroups(next, k);
        }
        
        return prev;
    }
    
    
    public void displayList(Node head){
        Node current = head;
        while (current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    
}

public class ReverseLL{   
public static void main(String [ ] args){
    // create a scanner to get the value from the user 
    Scanner sc = new Scanner(System.in);
    LinkedList linkedlist = new LinkedList();
    
    // get the ele N value 
    int n= sc.nextInt();
    
    // get the values from the user 
    for(int i=0; i<n; i++){
        int data = sc.nextInt();
        linkedlist.addNode(data);
    }
    
    // K 
    int k = sc.nextInt();
    
    // origibal LinkedList
     System.out.println("origibal LinkedList: ");
   linkedlist.displayList(linkedlist.head);
    linkedlist.head = linkedlist.reverseIngroups(linkedlist.head, k);
    
    // Reversed LinkedList
    System.out.println("Reversed LinkedList: ");
   linkedlist.displayList(linkedlist.head);
}

}
