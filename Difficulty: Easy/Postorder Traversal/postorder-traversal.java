/*
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> postOrder(Node root) {
       ArrayList <Integer> res =new ArrayList<>();  
        postorder(root,res);
        return res;        
    }
    void postorder(Node root,ArrayList<Integer> res){
        if (root == null)
            return;
        
        postorder(root.left,res);
        postorder(root.right,res);
        res.add(root.data);
    }
}