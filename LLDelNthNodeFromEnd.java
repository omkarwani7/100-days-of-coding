// leetcode Q. 19

class LLDelNthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null){
            return null;
        }
        
        int size = 0;
        ListNode curr = head;
        while(curr != null){
            curr = curr.next;
            size++;
        }
        if(size == n){
            return head.next;
        }
        int indexToFind = size - n;
        ListNode prev = head;
        int i = 1;
        while(i != indexToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
    }
}