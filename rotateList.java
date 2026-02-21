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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        List<ListNode> nodes = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            nodes.add(curr);
            curr = curr.next;
        }
        int n = nodes.size();
        k = k % n;
        if (k == 0) return head;
        int newHeadIndex = n-k;
        ListNode newHead = nodes.get(newHeadIndex);
        nodes.get(n - 1).next = nodes.get(0);
        nodes.get(newHeadIndex - 1).next = null;

        return newHead;
    }
}
