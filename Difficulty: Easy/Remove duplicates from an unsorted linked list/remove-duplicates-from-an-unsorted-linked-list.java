/* The structure of linked list is the following
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    // Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) {
        if (head==null) return head;
        HashSet<Integer> set = new HashSet<>();
        Node p= null,q=head;
        while(q!= null){
            if(!set.contains(q.data)){
                set.add(q.data);
                p=q;
            }
            else{
                p.next=q.next;
                q=q.next;
            }
           
        }
         return head;
    }
}
