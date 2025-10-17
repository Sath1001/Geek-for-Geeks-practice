// User function Template for Java

/*
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    */
class Solution {
    public static Node reverseBetween(int left, int right, Node head) {
        if(head==null || left ==right) return head;
        Node p = new Node(0);
        p.next=head;
        Node prev =p;
        for(int i =0;i<left-1;i++){
            prev=prev.next;
        }
        Node curr=prev.next;
        
        for(int i=0;i<right-left;i++){
            Node next=curr.next;
            curr.next=next.next;
            next.next=prev.next;
            prev.next=next;
        }
         
         return p.next;
        }
}