// sort elements in a doubly linked list
// https://www.onlinegdb.com/0tnRN6lXO

import java.util.Scanner;

class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        prev = null;
        next = null;
    }
}

public class SortDoublyLL {
    static Node head;

    public static void insertNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

    public static void displayList(Node node) {
        Node current = node;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static Node sortKSortedLinkedList(Node head, int k) {
        // Logic -1 
        if(head == null || head.next == null){
            return head;
        }
        Node sortedList = null;
        Node current = head;
        
        while (current != null){
            Node nextNode = current.next;
        sortedList = sortedInsert(sortedList, current, k);
        current = nextNode;
        }
        
        return sortedList;
    }

    public static Node sortedInsert(Node sortedList, Node node, int k) {
        // logic -2
        if(sortedList == null){
            sortedList = node;
            node.prev = null;
            node.next = null;
        } else if(node.data < sortedList.data){
            node.next = sortedList;
            sortedList.prev = node;
            node.prev = null;
            sortedList = node;
        } else{
            Node current = sortedList;
            int count =0;
            while(current.next != null && count<k && current.next.data<node.data){
                current = current.next;
                count++;
            }
            node.next = current.next;
            if(current.next != null){
                current.next.prev = node;
            }
            current.next = node;
            node.prev = current;
        }
        return sortedList;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Enter the number of nodes
        int n = scanner.nextInt();

        //Enter the maximum deviation (K)
        int k = scanner.nextInt();

      //Enter the elements of the doubly linked list
        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            insertNode(data);
        }

        System.out.println("Original List:");
        displayList(head);

        Node sortedList = sortKSortedLinkedList(head, k);

        System.out.println("Sorted List:");
        displayList(sortedList);

        scanner.close();
    }
}
