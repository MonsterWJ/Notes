package BasicLevelPractice;

import java.util.Scanner;

public class Main1007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberMax = sc.nextInt();
        boolean[] bo=new boolean[numberMax];
        int count = 0;
        for (int i = 3; i <= numberMax; i += 2) {
            if (isPrime(i) ){
                bo[i-1]=true;
                if(bo[i-3]) count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
            if (number % divisor == 0) return false;
        }
        return true;
    }
}
