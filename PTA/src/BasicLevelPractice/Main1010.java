package BasicLevelPractice;
//未完成
import java.util.Scanner;

public class Main1010 {
    public static void main(String[] args) {
        int[][] polynomial = new int[1000][2];
        int index = 0, count = 0, cout = 0;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            polynomial[index][0] = sc.nextInt();
            polynomial[index][1] = sc.nextInt();
            index++;
        }
        for (int i = 0; i < index; i++) {
            polynomial[i][0] *= polynomial[i][1];
            polynomial[i][1]--;
            if (polynomial[i][0] != 0) count++;
        }
        if (count == 0) System.out.println("0 0");
        else for (int i = 0; i < index; i++) {
            if (polynomial[i][0] != 0) {
                if (cout == 0) {
                    System.out.print(polynomial[i][0] + " " + polynomial[i][1]);
                    cout++;
                } else System.out.print(" " + polynomial[i][0] + " " + polynomial[i][1]);
            }
        }
    }
}
