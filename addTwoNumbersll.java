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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1=new Stack<Integer>();
        Stack<Integer> s2=new Stack<Integer>();
        while(l1!=null){
            s1.push(l1.val);
            l1=l1.next;
        }
        while(l2!=null){
            s2.push(l2.val);
            l2=l2.next;
        }
        int carry=0;
        ListNode dummy=null;
        while(!s1.isEmpty()||!s2.isEmpty()||carry!=0){
            int f=s1.isEmpty()?0:s1.pop();
            int s=s2.isEmpty()?0:s2.pop();
            int t=f+s+carry;
            ListNode n5=new ListNode(t%10);
            n5.next=dummy;
            dummy=n5;
            carry=t/10;

        }
        return dummy;
    }
}
