package QuickSort;
/*
    1.public static void sort(Comparable[] a)：对数组内的元素进行排序
    2.private static void sort(Comparable[] a, int low, int high)：对数组a中从索引low到索引high之间的元素进行排序
    3.public static int partition(Comparable[] a,int lo,int hi):对数组a中，从索引low到索引high之间的元素进行分组，并返回分组界限对应的索引
    4.private static boolean greater(Comparable a1,Comparable a2):判断a1是否大于a2
    5.private static void exchange(Comparable[] a,int i,int j)：交换a数组中，索引i和索引j处的值
*/

public class Quick {
    //对数组a中的元素进行排序(从小到大)
    public static void sort(Comparable[] a) {
        int low = 0;
        int high = a.length - 1;
        sort(a, low, high);
    }

    //对数组a中从low到high的元素进行排序
    private static void sort(Comparable[] a, int low, int high) {
        if (high <= low) {
            return;
        }
        //对a数组中，从low到high的元素进行切分
        int partition = partition(a, low, high);
        //对左边分组中的元素进行排序
        sort(a, low, partition - 1);
        //对右边分组中的元素进行排序
        sort(a, partition + 1, high);
    }

    public static int partition(Comparable[] a, int low, int high) {
        //把最左边的元素当做基准值
        Comparable key = a[low];
        //定义一个左侧指针，初始指向最左边的元素
        int left = low;
        //定义一个右侧指针，初始指向左右侧的元素下一个位置
        int right = high + 1;
        //进行切分
        while (true) {
            //先从右往左扫描，找到一个比基准值小的元素
            while (greater(a[--right], key)) {//循环停止，证明找到了一个比基准值小的元素
                if (right == low) {
                    break;//已经扫描到最左边了，无需继续扫描
                }
            }
            //再从左往右扫描，找一个比基准值大的元素
            while (greater(key, a[++left])) {//循环停止，证明找到了一个比基准值大的元素
                if (left == high) {
                    break;//已经扫描到了最右边了，无需继续扫描
                }
            }
            if (left >= right) {
                //扫描完了所有元素，结束循环
                break;
            } else {
                //交换left和right索引处的元素
                exchange(a, left, right);
            }
        }
        //交换最后rigth索引处和基准值所在的索引处的值
        exchange(a, low, right);
        return right;       //right就是切分的界限
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
