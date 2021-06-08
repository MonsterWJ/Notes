package BasicLevelPractice;

import java.util.Scanner;

public class Main1011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[][] comparison = new long[N][3];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                comparison[i][j] = sc.nextLong();
            }
        }

        for (int i = 0; i < N; i++) {
            if (comparison[i][0] + comparison[i][1] > comparison[i][2])
                System.out.println("Case #" + (i + 1) + ": true");
            else System.out.println("Case #" + (i + 1) + ": false");
        }
    }
}
