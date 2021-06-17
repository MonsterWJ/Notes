package BasicLevelPractice;

import java.util.Scanner;

public class Main1014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int DAY=0, HH=0, MM=0;
        int cnt = 0;
        String[] str = new String[4];
        String[] day = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        for (int i = 0; i < 4; i++) {
            str[i] = sc.next();
        }
        for (int i = 0; i < str[0].length() && i < str[1].length(); i++) {
            if (str[0].charAt(i) == str[1].charAt(i)&&(str[0].charAt(i)>='A'&&str[0].charAt(i)<='Z'||str[0].charAt(i)>='a'&&str[0].charAt(i)<='z')) {
                if (cnt == 0) {
                    if(str[0].charAt(i)>='A'&&str[0].charAt(i)<='Z'){
                        DAY = str[0].charAt(i) - 'A';
                        cnt++;
                    }
                } else {
                    HH = str[0].charAt(i) - 'A';
                    cnt++;
                    break;
                }
            }
        }
        for (int i = 0; i < str[2].length()&&i < str[3].length(); i++) {
            if (str[2].charAt(i) == str[3].charAt(i)&&(str[2].charAt(i)>='A'&&str[2].charAt(i)<='Z'||str[2].charAt(i)>='a'&&str[2].charAt(i)<='z')) {
                MM = i;
                break;
            }
        }
        if(MM>=10) System.out.println(day[DAY]+" "+(10+HH)+":"+MM);
        else System.out.println(day[DAY]+" "+(10+HH)+":0"+MM);
    }
}
