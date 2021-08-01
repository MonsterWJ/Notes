package Sort.InsertingSort;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Integer[] a = {4, 5, 6, 3, 2, 1};
        Insertion.sort(a);
        System.out.println(Arrays.toString(a));
    }
}