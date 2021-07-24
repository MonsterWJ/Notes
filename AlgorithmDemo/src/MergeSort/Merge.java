package MergeSort;

/*
    0.private static Comparable[] assist：完成归并操作需要的辅助数组
    1.public static void sort(Comparable[] a)：对数组内的元素进行排序
    2.private static void sort(Comparable[] a, int low, int high)：对数组a中从索引low到索引high之间的元素进行排序
    3.private static void merge(Comparable[] a, int low, int mid, int high):从索引lo到所以mid为一个子组，从索引mid+1到索引high为另一个子组，把数组a中的这两个子组的数据合并成一个有序的大组（从索引low到索引high）
    4.private static boolean greater(Comparable a1,Comparable a2):判断a1是否大于a2
*/
public class Merge {
    //归并所需要的辅助数组
    private static Comparable[] assist;


    //对数组a中的元素进行排序(从小到大)
    public static void sort(Comparable[] a) {
        assist = new Comparable[a.length];
        int low = 0;
        int high = a.length - 1;
        sort(a, low, high);
    }

    //对数组a中从low到high的元素进行排序
    private static void sort(Comparable[] a, int low, int high) {
        if (high <= low) {
            return;
        }
        int mid = low + (high - low) / 2;
        //对low到mid之间的元素进行排序；
        sort(a, low, mid);
        //对mid+1到hi之间的元素进行排序；
        sort(a, mid + 1, high);
        //对lo到mid这组数据和mid到hi这组数据进行归并
        merge(a, low, mid, high);
    }

    //对数组a，从low到mid为一组，从mid+1到high为一组，对这两组数据进行归并
    private static void merge(Comparable[] a, int low, int mid, int high) {

        //low到mid这组数据和mid+1到high这组数据归并到辅助数组assist对应的索引处
        int i = low;//定义一个指针，指向assist数组中开始填充数据的索引
        int p1 = low;//定义一个指针，指向第一组数据的第一个元素
        int p2 = mid + 1;//定义一个指针，指向第二组数据的第一个元素

        //比较左边小组和右边小组中的元素大小，哪个小，就把哪个数据填充到assist数组中
        while (p1 <= mid && p2 <= high) {
            if (greater(a[p1], a[p2])) {
                assist[i++] = a[p2++];
            } else {
                assist[i++] = a[p1++];
            }
        }
        //上面的循环结束后，如果退出循环的条件是p1<=mid，则证明左边小组中的数据已经归并完毕，如果退出循环的条件是p2<=high,则证明右边小组的数据已经填充完毕；
        //所以需要把未填充完毕的数据继续填充到assist中,//下面两个循环，只会执行其中的一个
        while (p1 <= mid) {
            assist[i++] = a[p1++];
        }
        while (p2 <= high) {
            assist[i++] = a[p2++];
        }
        //到现在为止，assist数组中，从low到high的元素是有序的，再把数据拷贝回a数组
//        for (int index = low; index <= high; index++) {
//            a[index] = assist[index];
//        }
        System.arraycopy(assist, low, a, low, high + 1 - low);
    }

    //比较a元素是否大于b元素
    private static boolean greater(Comparable a, Comparable b) {
        return a.compareTo(b) > 0;
    }

}