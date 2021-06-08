package BasicLevelPractice;
//不完全
import java.util.Scanner;

public class Main1012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[5];
        int[] count = new int[5];
        int[][] temp = new int[5][N];
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            temp[num % 5][count[num % 5]] = num;
            count[num % 5]++;
        }

        for (int i = 0; i < count[0]; i++) {
            if (temp[0][i] % 2 == 0)
                A[0] += temp[0][i];
        }

        for (int i = 0; i < count[1]; i++) {
            A[1] += temp[1][i] * Math.pow(-1, i);
        }

        A[2] = count[2];

        for (int i = 0; i < count[3]; i++) {
            A[3] += temp[3][i];
        }

        for (int i = 0; i < count[4]; i++) {
            A[4] = A[4] > temp[4][i] ? A[4] : temp[4][i];
        }

        for (int i = 0; i < 5; i++) {
            if (i != 0) System.out.print(" ");
            if (A[i] == 0) System.out.print("N");
            else if (i == 3) System.out.printf("%.1f", 1.0 * A[3] / count[3]);
            else System.out.print(A[i]);
        }
    }
}
