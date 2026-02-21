/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> n=new ArrayList<>();
        for(ListNode k:lists){
            while(k!=null){
               n.add(k.val);
               k=k.next;
            }
        }
        if(n.size()==0){
            return null;
        }
        Collections.sort(n);
        ListNode head=new ListNode(n.get(0));
        ListNode t=head;
        for(int i=1;i<n.size();i++){
         t.next=new ListNode(n.get(i));
         t=t.next;
        }
        return head;
    }
}
