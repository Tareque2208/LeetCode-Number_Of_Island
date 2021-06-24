class Scratch {
    public static void main(String[] args) {
        char grid[][] = {{1,1,1,1,0},{1,1,0,1,0},{1,1,0,0,0},{0,0,0,0,0}};
        IslandNumber a = new IslandNumber();
        a.numIslands(grid);
    }

    static class IslandNumber{
        public int numIslands(char[][] grid) {

            int count = 0;
            //Just simple row iteration
            //N.B : int[0] represents the the 1st row
            for (int i = 0; i < grid.length; i++) {
                //Just simple Column iteration
                //N.B : int[0] represents the the 1st row
                for (int j = 0; j < grid[i].length; j++) {
                    System.out.println("J is " + grid[i][j]);
                }

                System.out.println("I is " + i);
            }
            return count;
        }
    }

}