package BasicLevelPractice;

import java.util.Scanner;

public class Main1006 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] times=new int[3];
        char[] letter={'B','S'};
        for(int i=0;num!=0;i++){
            times[i]=num%10;
            num/=10;
        }
        for(int i=times.length-1;i>0;i--){
            for(int j=0;j<times[i];j++){
                System.out.print(letter[times.length-1-i]);
            }
        }
        for(int i=1;i<=times[0];i++){
            System.out.print(i);
        }
    }
}
