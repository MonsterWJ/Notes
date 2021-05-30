package BasicLevelPractice;

import java.util.Scanner;

public class Main1001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;
        while (a != 1) {
            if (a % 2 == 0) {
                a /= 2;
            } else {
                a = (a * 3 + 1) / 2;
            }
            count++;
        }
        System.out.println(count);
    }
}