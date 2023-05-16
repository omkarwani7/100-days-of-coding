// Q. given two linked lists, find point where the two linked lists intersect each other
/*
1- Intersection Point in Y-Shaped Linked Lists

Given two singly linked lists of size N and M, write a program to get the point where two linked lists intersect each other.

Input: 
Linked List 1 = 4->1->common
Linked List 2 = 5->6->1->common
common = 8->4->5->NULL
Output: 8
Explanation: 

4              5
|              |
1              6
 \             /
  8   -----  1 
   |
   4
   |
  5
  |
  NULL       
*/


import java.util.Scanner;
// lINK LIS
//1- head,2- data part(value), 3- Link part(link of the next node), 4- last node should be null(end of the node)
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
 
 
public class InsertionPointLL{
 
    public static void main(String [] args){
        // get the value from the user 
        Scanner sc = new Scanner(System.in);
         // gert the first linked IllegalMonitorStateException
         Node head1 = creeateLinkedList(sc);
            Node head2 = creeateLinkedList(sc);
                Node common = creeateLinkedList(sc);
 

    //connecting the common part
 
    Node current = head1;
    while(current.next != null){
        current=current.next;
    }
    current.next = common;
 
    current = head2;
    while(current.next != null){
        current = current.next;
    }
    current.next = common;
 
    // find the insertion
    Node insertionNode = getInsertionNode(head1, head2);
    if(insertionNode != null){
        System.out.println("Insertion point: "+insertionNode.data);
    }else{
        System.out.println("No insertion point found ");
    }
}
 
 
    // creating the LL
 
    private static Node creeateLinkedList(Scanner sc){
    Node dummy = new Node(0);
    Node current = dummy;
 
    int data;
    while(true){
        data = sc.nextInt();
        if(data == -1){
            break;
        }

    }
    return dummy.next;
    }
    public static Node getInsertionNode(Node head1, Node head2){
        int len1 = getLinkedListLength(head1);
        int len2 = getLinkedListLength(head2);
 
        int diff = Math.abs(len1 - len2);
 
        Node curr1 = head1;
        Node curr2 = head2;
 
        // Moving longer list
 
        if(len1 > len2){
            for(int i =0; i<diff; i++){
                curr1 = curr1.next;
            }
          }  else{
                for(int i=0; i< diff; i++){
                    curr2 = curr2.next;
                }
            }
    while (curr1 != null && curr2 != null){
        if(curr1==curr2){
            return curr1;
        }
        curr1 = curr1.next;
        curr2 = curr2.next;
        }
        return null; // no insertion poing 
    }
 
    private static int getLinkedListLength(Node head){
        int length =0;
        Node current = head;
        while(current != null){
            length++;
            current = current.next;
        }
        return length;
    }
}

