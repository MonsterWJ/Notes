package BasicLevelPractice;

import java.util.Scanner;

public class Main1007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        number = (number % 2 == 0) ? number - 1: number;
        boolean[] bool = new boolean[number+2];
        int count = 0;
        while (number > 2) {
            if (isPrime(number)) {
                bool[number - 1] = true;
                if (bool[number +1]) count++;
            }
            number-=2;
        }
        System.out.println(count);
    }

    public static boolean isPrime(int number) {
        for (int divisor = 3; divisor <= Math.sqrt(number); divisor += 2) {
            if (number % divisor == 0) return false;
        }
        return true;
    }
}
