package JZ9;


/*  暴力
public class Solution {
    public int jumpFloorII(int target) {
        int[] jump = new int[target + 1];
        jump[0] = 1;
        for (int i = 1; i <= target; i++) {
            for (int j = 0; j < i; j++) {
                jump[i] += jump[j];
            }
        }
        return jump[target];
    }
}
*/

public class Solution {
    public int jumpFloorII(int target) {
        if (target == 0 || target == 1) return 1;
        int a = 1, b = 0;
        for (int i = 2; i <= target; ++i) {
            b = a << 1; //  口诀：左移乘2，右移除2
            a = b;
        }
        return b;
    }
}