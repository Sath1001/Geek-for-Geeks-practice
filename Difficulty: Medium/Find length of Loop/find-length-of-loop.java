/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public int lengthOfLoop(Node head) {
        // code here
        if(head==null || head.next==null) return 0;
        Node s=head,f=head;
        int c=0;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
            if(s==f){
                c=1;
                s=s.next;
                while(s!=f){
                    c++;
                    s=s.next;
                }
                break;
            }
        }
        return c;
    }
}