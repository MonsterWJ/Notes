package BasicLevelPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main1015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, L, H, count = 0;
        N = sc.nextInt();
        L = sc.nextInt();
        H = sc.nextInt();
        stu[] student = new stu[N];
        for (int i = 0; i < N; i++) {
            String studentID = sc.next();
            int de = sc.nextInt();
            int cai = sc.nextInt();
            student[i] = new stu(studentID, de, cai, H, L);
            if (student[i].grade != 5) count++;
        }
        Arrays.sort(student, 0, N, new cmp());
        System.out.println(count);
        for (int i = 0; i < count; i++) {
            System.out.println(student[i].studentID + " " + student[i].de + " " + student[i].cai);
        }
    }
}

class stu {
    String studentID;
    int de, cai, sum, grade;

    public stu(String studentID, int de, int cai, int H, int L) {
        this.studentID = studentID;
        this.de = de;
        this.cai = cai;
        this.sum = this.de + this.cai;
        if (this.de >= H && this.cai >= H) {
            this.grade = 1;
        } else if (this.de >= H && this.cai >= L) {
            this.grade = 2;
        } else if (this.cai >= L && this.de >= this.cai) {
            this.grade = 3;
        } else if (this.de >= L && this.cai >= L) {
            this.grade = 4;
        } else this.grade = 5;
    }
}

class cmp implements Comparator<stu> {
    public int compare(stu a, stu b) {
        if (a.grade != b.grade) return a.grade - b.grade;
        else if (a.sum != b.sum) return b.sum - a.sum;
        else if (a.de != b.de) return b.de - a.de;
        else return a.studentID.compareTo(b.studentID);
    }
}
//int compare(Object o1, Object o2) 返回一个基本类型的整型
//如果要按照升序排序，则o1 小于o2，返回-1（负数），相等返回0，01大于02返回1（正数）
//如果要按照降序排序 则o1 小于o2，返回1（正数），相等返回0，01大于02返回-1（负数）
