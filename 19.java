struct ListNode* removeNthFromEnd(struct ListNode* head, int n) {
    int len = 0;
    struct ListNode* temp = head;
    while(temp != NULL) {
        len++;
        temp = temp->next;
    }
    
    if (n == len) {
        struct ListNode* newHead = head->next;
        return newHead;
    }
    
    struct ListNode* prev = head;
    for (int i = 1; i < (len - n); i++) {
        prev = prev->next;
    }
    
    struct ListNode* target = prev->next;
    prev->next = target->next;
    
    return head;
}
