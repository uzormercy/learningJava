class MultiDimensionalArray {

     public static void main(String[] args) {

        // int[] values =  {3, 5, 8};

        int[][]   grid = {
            {3, 5, 8},
            {2, 0, 5},
            {1, 4, 7, 9}
        };
        
        for(int row = 0; row < grid.length; row++) {
            for(int col = 0; col < grid[row].length; col++) {
                System.out.print(grid[row][col] + "\t");
            }
            System.out.println();
        }
    }
    
}
