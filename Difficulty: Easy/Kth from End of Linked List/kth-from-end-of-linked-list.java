/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        
    Node s=head,f=head;
    if(head==null) return -1;
    
    for(int i=0 ;i<k;i++)
    {
        if(f != null )
            f=f.next;
        else return -1;
    }
    while(f != null)
    {
        s=s.next;
        f=f.next;
    }
    
    return s.data;
    }
}