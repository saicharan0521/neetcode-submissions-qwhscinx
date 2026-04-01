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
    public ListNode reverseList(ListNode head) 
    {
        if(head==null||head.next==null)
            return head;
        ListNode ptr1=null,ptr2 = head,ptr3 = head.next;
        while(ptr2!=null)
        {
            ptr2.next = ptr1;
            ptr1 = ptr2;
            ptr2 = ptr3;
            if(ptr3!=null)
                ptr3=ptr3.next; 
        }    
        head = ptr1;
        return head;
    }
}
