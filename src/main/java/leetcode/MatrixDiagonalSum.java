package main.java.leetcode;

// leetcode 1572
public class MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        int dimension = mat.length;
        int sum = 0;

        for (int i = 0; i < dimension; i++) {
            sum += mat[i][i];
            sum += mat[i][dimension - 1 - i];
        }

        if (dimension % 2 != 0) {
            sum -= mat[dimension / 2][dimension / 2];
        }

        return sum;
    }
}
