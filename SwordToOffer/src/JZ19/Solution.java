package JZ19;

import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> array = new ArrayList<>();

        int right = matrix[0].length - 1;
        int left = 0;
        int top = 0;
        int down = matrix.length - 1;

        while (true) {
            for (int i = left; i <= right; i++) {
                array.add(matrix[top][i]);
            }
            if (++top > down) {
                break;
            }
            for (int i = top; i <= down; i++) {
                array.add(matrix[i][right]);
            }
            if (--right < left) {
                break;
            }
            for (int i = right; i >= left; i--) {
                array.add(matrix[down][i]);
            }
            if (--down < top) {
                break;
            }
            for (int i = down; i >= top; i--) {
                array.add(matrix[i][left]);
            }
            if (++left > right) {
                break;
            }
        }
        return array;
    }
}
