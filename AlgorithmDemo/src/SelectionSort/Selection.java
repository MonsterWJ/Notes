package SelectionSort;

public class Selection {
    //对数组a中的元素进行排序(从小到大)
    public static void sort(Comparable[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = i;
            for (int j = i; j < a.length; j++) {
                if (greater(a[minIndex], a[j])) {
                    minIndex = j;
                }
                if (minIndex != i) {
                    exchange(a, i, minIndex);
                }
            }
        }
    }

    //比较a元素是否大于b元素
    private static boolean greater(Comparable a, Comparable b) {
        return a.compareTo(b) > 0;
    }

    //数组元素1和元素2交换位置
    private static void exchange(Comparable[] a, int index1, int index2) {
        Comparable temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }

}
