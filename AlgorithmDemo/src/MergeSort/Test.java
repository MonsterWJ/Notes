package MergeSort;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Integer[] a = {4, 6, 8, 7, 9, 2, 10, 1};
        Merge.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
