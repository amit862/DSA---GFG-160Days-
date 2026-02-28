class Solution {
    
    boolean [][] row = new boolean[9][10];
    boolean [][] col = new boolean[9][10];
    boolean [][] box = new boolean[9][10];
    
    public void solveSudoku(int[][] mat) {
        // code here
        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                if(mat[i][j] != 0) {
                    int num = mat[i][j];
                    row[i][num] = true;
                    col[j][num] = true;
                    box[(i/3)*3 + j/3][num] = true;
                }
            }
        }
        solve(mat,0,0);
    }
    
    boolean solve(int[][] mat, int r, int c) {
        if(r == 9) 
            return true;
        
        int nextR = (c == 8) ? r + 1 : r;
        int nextC = (c == 8) ? 0 : c + 1;
        
        if(mat[r][c] != 0)
            return solve(mat, nextR, nextC); 
        
        for(int num = 1; num <= 9; num++) {
            int boxIndex = (r/3)*3 + c/3;
            
            if(!row[r][num] && !col[c][num] && !box[boxIndex][num]) {
               mat[r][c] = num;
               row[r][num] = col[c][num] = box[boxIndex][num] = true;
               
               if(solve(mat, nextR, nextC))
                    return true;
                    
                mat[r][c] = 0;
                row[r][num] = col[c][num] = box[boxIndex][num] = false;
            }
        } 
        return false;
    }
}