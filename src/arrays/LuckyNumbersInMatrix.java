package arrays;

import java.util.ArrayList;
import java.util.List;

// leetcode 1380
public class LuckyNumbersInMatrix {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> candidates = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            int rowMin = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] < rowMin) {
                    rowMin = matrix[i][j];
                }
            }
            candidates.add(rowMin);
        }

        for (int j = 0; j < n; j++) {
            int colMax = Integer.MIN_VALUE;
            for (int i = 0; i < m; i++) {
                if (matrix[i][j] > colMax) {
                    colMax = matrix[i][j];
                }
            }

            if (candidates.contains(colMax)) {
                result.add(colMax);
            } else {
                candidates.add(colMax);
            }
        }

        return result;
    }
}
