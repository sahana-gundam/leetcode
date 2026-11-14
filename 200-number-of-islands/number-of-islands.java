class Solution {
    public int numIslands(char[][] grid) {
        int c=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    c++;
                    dfs(i,j,grid);
                }
            }
        }
        return c;
    }
    public void dfs(int r,int c,char[][] grid){
        int row = grid.length;
        int col = grid[0].length;
        if(r>=row || c>=col || c<0 || r<0 || grid[r][c]=='0'){
            return;
        }
        grid[r][c] = '0';
        dfs(r-1,c,grid);
        dfs(r,c+1,grid);
        dfs(r,c-1,grid);
        dfs(r+1,c,grid);
    }
}