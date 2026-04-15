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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        int carry = 0;
        int sum=0;
        ListNode head = null;
        ListNode temp = head;
        while(l1!=null&&l2!=null) 
        {
            sum = carry;
            sum += l1.val+l2.val;
            carry = sum/10;
            if(head==null)
            {
                head = new ListNode(sum%10);
                temp = head;
            }
            else
            {
                temp.next = new ListNode(sum%10);
                temp = temp.next;
            }
            l1 = l1.next;
            l2 = l2.next;
        } 


        
        while(l1!=null)
        {
            sum = carry;
            sum+=l1.val;
            carry = sum/10;
            temp.next = new ListNode(sum%10);
            temp = temp.next;
            l1 = l1.next;
        }

        while(l2!=null)
        {
            sum = carry;
            sum+=l2.val;
            carry = sum/10;
            temp.next = new ListNode(sum%10);
            temp = temp.next;
            l2 = l2.next;
        }

        if(carry>0)
        {
            temp.next = new ListNode(carry);
            temp = temp.next;
        }

        return head;
    }
}
