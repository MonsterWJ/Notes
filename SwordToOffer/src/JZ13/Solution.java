package JZ13;

public class Solution {
    public int[] reOrderArray(int[] array) {
        int temp[] = new int[array.length];
        int index = 0;
        for (int n : array) if (n % 2 == 1) temp[index++] = n;
        for (int n : array) if (n % 2 == 0) temp[index++] = n;
        return temp;
    }
}