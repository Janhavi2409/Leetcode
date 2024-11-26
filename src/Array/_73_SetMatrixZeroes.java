package Array;

public class _73_SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] row0 = new int[rows];
        int[] col0 = new int[cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    row0[i] = 1;
                    col0[j] = 1;
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (row0[i] == 1 || col0[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
