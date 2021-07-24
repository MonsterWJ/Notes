package ShellSort;

public class Shell {
    /**
     * 对数组a中的元素进行排序(从小到大)
     */
    public static void sort(Comparable[] a) {
        //确定增长量h的最大值
        int N = a.length;
        int h = 1;
        while (h < N / 2) {
            h = h * 2 + 1;
        }
        //当增长量h小于1，排序结束
        while (h >= 1) {
            //找到待插入的元素
            for (int i = h; i < N; i++) {
                //a[i]就是待插入的元素
                //把a[i]插入到a[i-h],a[i-2h],a[i-3h]...序列中
                for (int j = i; j >= h; j -= h) {
                    //a[j]就是待插入元素，依次和a[j-h],a[j-2h],a[j-3h]进行比较，如果a[j]小，那么交换位置，如果不小于，a[j]大，则插入完成。
                    if (greater(a[j - h], a[j])) {
                        exchange(a, j, j - h);
                    } else {
                        break;
                    }
                }
            }
            h /= 2;
        }
    }

    /**
     * 比较a元素是否大于b元素
     */
    private static boolean greater(Comparable a, Comparable b) {
        return a.compareTo(b) > 0;
    }

    /**
     * 数组元素1和元素2交换位置
     */
    private static void exchange(Comparable[] a, int index1, int index2) {
        Comparable temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }
}
