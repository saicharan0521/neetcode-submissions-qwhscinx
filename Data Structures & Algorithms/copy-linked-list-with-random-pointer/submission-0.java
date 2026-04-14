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
            return null;
        Map<Node,Node> map = new HashMap<>();
        Node hnew = null;  // hnew = new head
        Node temp = head;
        Node tnew = hnew; // tnew = new temp
        Node newNode = null;
        while(temp!=null)
        {
            newNode = new Node(temp.val);
            if(hnew==null)
            {
                hnew = newNode;
                tnew = hnew; 
            }
            else
            {
                tnew.next = newNode;
                tnew = tnew.next;
            }
            map.put(temp,tnew);
            temp = temp.next;
        }

        tnew = hnew;
        temp = head;

        while(temp!=null)
        {
            tnew.random = map.get(temp.random);
            tnew = tnew.next;
            temp = temp.next;
        }

        return hnew;

    }
}
