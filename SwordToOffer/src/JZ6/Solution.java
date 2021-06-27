package JZ6;

public class Solution {
    public int minNumberInRotateArray(int[] array) {
        if (array.length == 0) return 0;
        int first = 0;
        int last = array.length - 1;
        while (first < last) {
            if (array[first] < array[last]) return array[first];
            int mid = (first + last) / 2;
            if (array[mid] > array[last]) {
                first = mid + 1;
            } else if (array[mid] < array[last]) {
                last = mid;
            } else {
                last--;
            }
        }
        return array[first];
    }
}