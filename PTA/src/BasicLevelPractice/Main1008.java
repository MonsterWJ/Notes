package BasicLevelPractice;

import java.util.Scanner;

public class Main1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        if (M > N) M %= N;
        int[] array = new int[N];
        for (int i = 0; i < N; i++) array[i] = sc.nextInt();
        reserve(array, 0, N - M);
        reserve(array, N - M, M);
        reserve(array, 0, N);
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(array[N - 1]);
    }

    public static void reserve(int[] array, int n, int m) {
        for (int i = n; i < n + m / 2; i++) {
            int temp = array[i];
            array[i] = array[n * 2 + m - 1 - i];
            array[n * 2 + m - 1 - i] = temp;
        }
    }
}
