package JZ11;

public class Solution {
    public int NumberOf1(int n) {
        int count = 0;
        int mark = 1;
        while (mark != 0) {
            if ((mark & n) != 0) count++;
            mark <<= 1;
        }
        return count;
    }
}