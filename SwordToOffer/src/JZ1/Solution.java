package JZ1;

public class Solution {
    public boolean Find(int target, int[][] array) {
        int m = array.length;
        if (m == 0) return false;
        int n = array[0].length;
        if (n == 0) return false;
        int x = 0, y = n - 1;
        while (x < m && y >= 0) {
            if (target == array[x][y]) {
                return true;
            } else if (target < array[x][y]) {
                y--;
            } else {
                x++;
            }
        }
        return false;
    }
}
