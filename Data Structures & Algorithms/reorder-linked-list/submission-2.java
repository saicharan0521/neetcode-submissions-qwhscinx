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

class Solution 
{
    ListNode rev(ListNode head)
    {        
        ListNode f = head; // f = first node;
        ListNode n = head.next; // n = next node
        ListNode prev = n;
        f.next = null;
        while(prev!=null)
        {
            prev = prev.next;
            n.next = f;
            f=n;
            n = prev;
        }

        head = f;
        return head;
    }

    public void reorderList(ListNode head) 
    {
        if(head.next==null||head.next.next==null)
            return;

        ListNode l1 = head;
        ListNode l2;
        ListNode fast = head,slow = head;
        ListNode prev = slow;
        while(fast!=null&&fast.next!=null)
        {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        
        prev.next=null;
        l2 = rev(slow);
        l1 = head.next;
        ListNode node = head;
        node.next=null;
        while(l1!=null&&l2!=null)
        {
            node.next = l2;
            node = node.next;
            l2 = l2.next;
            node.next = l1;
            node = node.next;
            l1 = l1.next;
        }

        if(l1!=null)
        {    
            node.next = l1;
        }
        
        else
        {
            node.next = l2;
        }
    }
}