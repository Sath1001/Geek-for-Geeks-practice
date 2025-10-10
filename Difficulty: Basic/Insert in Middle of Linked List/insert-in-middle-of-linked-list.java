/*
Structure of node class is:
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    public Node insertInMiddle(Node head, int x) {
        if(head == null) return new Node(x);
        Node s=head,f=head;
        while(f.next != null && f.next.next != null){
            f=f.next.next;
            s= s.next;
        }
        Node r= new Node(x);
        r.next=s.next;
        s.next=r;
        return head;
    }
}