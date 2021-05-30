package BasicLevelPractice;

import java.util.Scanner;

public class Main1003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();//字符串个数
        //输入字符串
        String[] s = new String[number];
        for (int i = 0; i < number; i++) {
            s[i] = sc.next();
        }
        //判断字符串是否正确
        for (int i = 0; i < number; i++) {
            if (judge(s[i])) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean judge(String s) {
        //统计P、A、T个数
        int leftA = 0, insideA = 0, rightA = 0, pnum = 0, tnum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'A' && s.charAt(i) != 'P' && s.charAt(i) != 'T') {
                return false;
            }
            if (s.charAt(i) == 'A') {
                if (pnum == 0) {
                    leftA++;
                } else if (pnum == 1 && tnum == 0) {
                    insideA++;
                } else if (pnum == 1 && tnum == 1) {
                    rightA++;
                }
            } else if (s.charAt(i) == 'P') {
                pnum++;
            } else if (s.charAt(i) == 'T'){
                tnum++;
            }
        }
        //判断
        if (pnum != 1 || tnum != 1) {
            return false;
        } else if(insideA==0){
            return false;
        } else if (leftA * insideA != rightA) {
            return false;
        } else {
            return true;
        }
    }
}
