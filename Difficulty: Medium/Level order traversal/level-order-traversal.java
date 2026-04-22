/*
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        // code here
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    dfs(root, 0, result);
    return result;
    }
    
    private void dfs(Node root, int level, ArrayList<ArrayList<Integer>> result) {
        if(root == null) return;
        
        if(result.size() == level) {
            result.add(new ArrayList<>());
        }
        
        result.get(level).add(root.data);
        
        dfs(root.left, level + 1, result);
        dfs(root.right, level + 1, result);
    }
}