/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* swapPairs(struct ListNode* head) {
    
    if(head == NULL || head->next == NULL){
        return head;
    }
    struct ListNode* temp = head;
    while(temp != NULL && temp->next != NULL){
        int t=temp->val;
        temp->val=temp->next->val;
        temp->next->val=t;
        temp=temp->next->next;
    }
    return head;
}
