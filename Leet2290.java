public class Leet2290 {
    public int minimumObstacles(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean[][] visited=new boolean[m][n];
        visited[0][0]=true;
        int minObstacles=Integer.MAX_VALUE;
        return minimumObstaclesHelper(grid,0,0,visited,minObstacles);
    }
    private int minimumObstaclesHelper(int[][] grid,int x,int y,boolean[][] visited,int minObstacles)
    {
        int m=grid.length;
        int n=grid[0].length;
        if(x==m-1 && y==n-1)
        {
            return grid[x][y];
        }
        int[] xDir={0,0,1,-1};
        int[] yDir={1,-1,0,0};
        for(int i=0;i<4;i++)
        {
            int newX=x+xDir[i];
            int newY=y+yDir[i];
            if(newX>=0 && newX<m && newY>=0 && newY<n && !visited[newX][newY])
            {
                visited[newX][newY]=true;
                int obstacles=minimumObstaclesHelper(grid,newX,newY,visited,minObstacles);
                if(grid[x][y]==1)
                {
                    obstacles=obstacles+1;
                }
                visited[newX][newY]=false;
                minObstacles=Math.min(minObstacles,obstacles);
            }
        }
        return minObstacles;
    }
}
