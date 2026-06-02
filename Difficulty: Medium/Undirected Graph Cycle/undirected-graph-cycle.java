class Solution {
    public boolean isCycle(int V, int[][] edges) {
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        
        for(int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        
        boolean[] vis = new boolean[V];
        
        for(int i = 0; i < V; i++) {
            if(!vis[i] && dfs(i, -1, adj, vis))
                return true;
        }
        
        return false;
    }
    
    private boolean dfs(int node, int parent,
                        ArrayList<ArrayList<Integer>> adj,
                        boolean[] vis) {
        
        vis[node] = true;
        
        for(int nbr : adj.get(node)) {
            if(!vis[nbr]) {
                if(dfs(nbr, node, adj, vis))
                    return true;
            }
            else if(nbr != parent) {
                return true;
            }
        }
        
        return false;
    }
}

