package BasicLevelPractice;

import java.util.Scanner;

public class Main1002 {
    public static void main(String[] args) {
        String[] pinyin = {"ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu"};
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count += s.charAt(i) - '0';
        }
        String sout = String.valueOf(count);
        for (int i = 0; i < sout.length() - 1; i++) {
            System.out.print(pinyin[sout.charAt(i) - '0'] + " ");
        }
        System.out.println(pinyin[sout.charAt(sout.length() - 1) - '0']);
    }
}
