/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) 
    {
        if(head==null)
            return head;
        Node temp = head;
        Node hnew = null;
        Node tnew = hnew;

        while(temp!=null)
        {
            Node newNode = new Node(temp.val);
            newNode.next = temp.next;
            temp.next = newNode;
            temp = temp.next.next;
        }
        
        temp = head;

        while(temp!=null)
        {
           if(temp.random==null)
            temp.next.random = null;
           else
            temp.next.random = temp.random.next;
            temp = temp.next.next; 
        }

        temp = head;
        tnew = temp.next;
        hnew = tnew;
        while(tnew.next!=null)
        {
            temp.next = temp.next.next;
            tnew.next = tnew.next.next;
            temp = temp.next;
            tnew = tnew.next;
        }
        temp.next = null;

        return hnew;
    }
}
