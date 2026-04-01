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
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {   
        int len = 0;
        ListNode temp = head;
        while(temp!=null)
        {
            len++;
            temp = temp.next;
        }
        int val = len-n+1;
        if(val==1)
        {
            head = head.next;
            return head;
        }
        ListNode ptr = head;
        for(int i=1;i<val-1;i++)
            ptr = ptr.next; 
        ptr.next = ptr.next.next;
        return head;
    }
}
