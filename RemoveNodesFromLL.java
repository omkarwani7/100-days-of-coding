// leetcode 2487

class RemoveNodesFromLL{
    public ListNode removeNodes(ListNode head) {
        Stack<Integer> st=new Stack<>();
        ListNode rev=reverse(head);
        while(rev!=null){
            if(st.isEmpty() || (!st.isEmpty() && rev.val>=st.peek())){
                st.push(rev.val);
            }
            rev=rev.next;
        }
        ListNode dummy=new ListNode();
        ListNode curr=dummy;
        while(!st.isEmpty()){
            curr.next=new ListNode(st.pop());
            curr=curr.next;
        }
        return dummy.next;
    }

    ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        ListNode next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}