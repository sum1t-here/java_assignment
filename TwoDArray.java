public class TwoDArray {
    public static void main(String[] args) {
        // Define a two-dimensional array with 3 rows and 4 columns
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        
        // Get the number of rows in the array using .length
        int numRows = arr.length;
        System.out.println("Number of rows: " + numRows);
        
        // Get the number of columns in the first row using .length
        int numCols = arr[0].length;
        System.out.println("Number of columns in the first row: " + numCols);


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Element at row " + i + " and column " + j + ": " + arr[i][j]);
            }
        }
        
    }
}

