package JZ28;

import java.util.HashMap;

public class Solution {
    public int MoreThanHalfNum_Solution(int[] array) {
        HashMap<Integer, Integer> countMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < array.length; i++) {
            if (countMap.containsKey(array[i])) {
                countMap.put(array[i], countMap.get(array[i]) + 1);
            } else {
                countMap.put(array[i], 1);
            }
            if (countMap.get(array[i]) > array.length / 2) {
                return array[i];
            }
        }
        return -1;
    }
}
