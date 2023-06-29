import java.util.*;
public class LLPalindrome{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head = null;
    public static Node tail = null;

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
        public Node getMiddle(Node head){
            Node hare = head;
            Node turtle = head;
            while(hare.next!=null && hare.next.next!=null){
                hare = hare.next.next;
                turtle = turtle.next;
            }
            return turtle;
        }
       
    public Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    
    public boolean isPalindrome(Node head){
        if(head==null || head.next==null){
            return true;
        }
        Node fhe = getMiddle(head);
        Node shs = reverse(fhe.next);
        Node fhs = head;
        while(shs != null){
            if(shs.data != fhs.data){
                return false;
            }
            shs = shs.next;
            fhs = fhs.next;
        }
        return true;
    }
        
    
    public static void main(String[] args){
        LLPalindrome list = new LLPalindrome();
        list.addAtBeginning(1);
        list.addAtBeginning(2);
        list.addAtBeginning(3);
        list.addAtBeginning(2);
        list.addAtBeginning(1);
        list.display();
        // list.isPalindrome(head);
        System.out.println(list.isPalindrome(head));
    }

}