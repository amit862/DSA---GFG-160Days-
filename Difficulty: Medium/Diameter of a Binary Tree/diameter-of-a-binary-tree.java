/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
} */

class Solution {
    static int maxDia;
    public int diameter(Node root) {
        // code here
        maxDia =0;
        levels(root);
        return maxDia;
        
    }
    
    private int levels(Node root) {
        if(root == null) return 0;
        
        int leftLevels = levels(root.left);
        int rightLevels = levels(root.right);
        maxDia = Math.max(maxDia, leftLevels + rightLevels);
        return 1 + Math.max(leftLevels, rightLevels);
        
    }
}