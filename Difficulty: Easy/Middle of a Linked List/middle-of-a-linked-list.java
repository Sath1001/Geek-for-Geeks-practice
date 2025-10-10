/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    int getMiddle(Node head) {
        Node slow =head;
        Node fast=head;
        while(fast != null && fast.next != null){
            fast=fast.next.next;
            slow = slow.next;
            }
            return slow.data;
        
    }
}