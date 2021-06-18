package BasicLevelPractice;

import java.util.Scanner;

public class Main1014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[4];
        String[] day = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        for (int i = 0; i < 4; i++) {
            str[i] = sc.next();
        }
        for (int i = 0, cnt = 0; i < str[0].length() && i < str[1].length(); i++) {
            if (str[0].charAt(i) == str[1].charAt(i)) {
                if (cnt == 0 && str[0].charAt(i) >='A' && str[0].charAt(i) <= 'G') {
                    System.out.print(day[str[0].charAt(i) - 'A'] + " ");
                    cnt++;
                } else if (cnt == 1) {
                    if (isDigit(str[0].charAt(i))) {
                        System.out.print("0" + str[0].charAt(i));
                        break;
                    } else if (str[0].charAt(i) >= 'A' && str[0].charAt(i) <= 'N') {
                        System.out.print(10 + (str[0].charAt(i) - 'A'));
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < str[2].length() && i < str[3].length(); i++) {
            if (str[2].charAt(i) == str[3].charAt(i) && isLetter(str[2].charAt(i))) {
                if (i < 10) {
                    System.out.print(":0" + i);
                } else {
                    System.out.print(":" + i);
                }
                break;
            }
        }
    }

    public static boolean isDigit(char ch) {
        if (ch >= '0' && ch <= '9')
            return true;
        else return false;
    }

    public static boolean isLetter(char ch) {
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
            return true;
        else return false;
    }
}
