package BasicLevelPractice;

import java.util.Scanner;

public class Main1014 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int DAY,HH,MM,cnt=0;
        String[] str=new String[4];
        for(int i=0;i<4;i++){
            str[i]=sc.next();
        }
        for(int i=0;i<str[0].length();i++){
            for(int j=0;j<str[1].length();j++){
                if(str[0].charAt(i)==str[1].charAt(j)){
                    if(cnt==0){
                        DAY=str[0].charAt(i)-'A'+1;
                        cnt++;
                    }else {
                        HH=
                    }
                }
            }
        }

    }
}
