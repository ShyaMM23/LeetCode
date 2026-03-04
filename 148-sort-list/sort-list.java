class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ArrayList<Integer> ar=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            ar.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(ar); 
        ListNode t1=new ListNode(ar.get(0));
        ListNode current=t1;
        for (int i=1;i<ar.size();i++) {
            current.next=new ListNode(ar.get(i));
            current=current.next;
        }
        return t1;
    }
}
