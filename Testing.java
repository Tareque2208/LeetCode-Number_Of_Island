public class Testing {
    public static void main(String[] args){
        // char grid[][] = {{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
        char grid[][] = {{'1','1','0','0','0'},{'1','1','0','0','0'},{'1','0','1','0','0'},{'0','0','0','1','1'}};
        Solution a = new Solution();
        a.numIslands(grid);
    }
}
