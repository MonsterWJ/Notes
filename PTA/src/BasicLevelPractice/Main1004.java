package BasicLevelPractice;

import java.util.Scanner;

public class Main1004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();//学生个数
        //输入学生姓名、学号、成绩
        String[] name = new String[number];
        String[] studentNumber = new String[number];
        int[] score = new int[number];
        for (int i = 0; i < number; i++) {
            name[i] = sc.next();
            studentNumber[i] = sc.next();
            score[i] = sc.nextInt();
        }
        //找出最高分最低分
        int maxIndex = 0, minIndex = 0;
        for (int i = 0; i < number; i++) {
            maxIndex = score[i] > score[maxIndex] ? i : maxIndex;
            minIndex = score[i] < score[minIndex] ? i : minIndex;
        }
        //输出对应学生信息
        System.out.println(name[maxIndex] + " " + studentNumber[maxIndex]);
        System.out.println(name[minIndex] + " " + studentNumber[minIndex]);
    }
}
