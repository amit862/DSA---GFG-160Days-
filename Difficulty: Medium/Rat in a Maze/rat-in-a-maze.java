class Solution {
    
    static ArrayList<String> result;
    static int n;
    
    public ArrayList<String> ratInMaze(int[][] maze) {
        result = new ArrayList<>();
        n = maze.length;
        
        if (maze[0][0] == 0 || maze[n - 1][n - 1] == 0) {
            return result;
        }
        
        boolean[][] visited = new boolean[n][n];
        solve(0, 0, maze, visited, "");
        
        Collections.sort(result);
        return result;
    }
    
    private void solve(int row, int col, int[][] maze,
                       boolean[][] visited, String path) {
        
        if (row == n - 1 && col == n - 1) {
            result.add(path);
            return;
        }
        
        visited[row][col] = true;
        
        // Down
        if (isSafe(row + 1, col, maze, visited))
            solve(row + 1, col, maze, visited, path + "D");
        
        // Left
        if (isSafe(row, col - 1, maze, visited))
            solve(row, col - 1, maze, visited, path + "L");
        
        // Right
        if (isSafe(row, col + 1, maze, visited))
            solve(row, col + 1, maze, visited, path + "R");
        
        // Up
        if (isSafe(row - 1, col, maze, visited))
            solve(row - 1, col, maze, visited, path + "U");
        
        visited[row][col] = false; // backtrack
    }
    
    private boolean isSafe(int row, int col,
                           int[][] maze, boolean[][] visited) {
        return row >= 0 && row < n &&
               col >= 0 && col < n &&
               maze[row][col] == 1 &&
               !visited[row][col];
    }
}