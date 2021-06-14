package BasicLevelPractice;

import java.util.Scanner;

public class Main1013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int count = 0;
        int num = 2;
        int[] prime = new int[N];
        while (count < N) {
            if (isPrime(num)) {
                prime[count] = num;
                count++;
            }
            num++;
        }
        int flag = 0;
        for (int i = M - 1; i <= N - 1; i++) {
            if (flag == 10) {
                System.out.println();
                flag = 0;
            }
            if (flag >= 1 & flag <= 9) {
                System.out.print(" ");
            }
            System.out.print(prime[i]);
            flag++;
        }
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
