package BasicLevelPractice;
//不完全
import java.util.Scanner;

public class Main1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        int[] index = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
                index[count] = i;
            }
        }
        count++;
        index[count] = str.length();

        while (count > 1) {
            count--;
            show(str, index[count]+1, index[count + 1]);
            System.out.print(" ");
        }
        while (count > 0) {
            count--;
            show(str, index[count], index[count + 1]);
        }
    }

    public static void show(String str, int start, int end) {
        for (int index = start; index < end; index++) {
            System.out.print(str.charAt(index));
        }
    }
}
