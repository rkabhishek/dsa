package main.java.leetcode;

// leetcode 1572
public class MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        int dimension = mat.length;
        int sum = 0;

        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                if (i == j || (i + j == dimension - 1)) {
                    sum += mat[i][j];
                }
            }
        }

        return sum;
    }
}
