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
}
*/

class Solution {
    public Node LCA(Node root, Node n1, Node n2) {
        // code here
        while (root != null) {
            if(n1.data < root.data && n2.data < root.data) {
                root = root.left;
            }
            else if(n1.data > root.data && n2.data > root.data) {
                root= root.right;
            }
            else {
                return root;
            }
        }
        return null;
    }
}