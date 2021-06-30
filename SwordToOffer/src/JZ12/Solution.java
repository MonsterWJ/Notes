package JZ12;

public class Solution {
    public double Power(double base, int exponent) {
        if (base == 0.0) return 0;
        if (exponent == 0) return 1;
        if (exponent < 0) {
            base = 1 / base;
            exponent = -exponent;
        }
        double ret = 1.0;
        double temp = base;
        while (exponent > 0) {
            if ((exponent & 1) == 1) {
                ret *= temp;
            }
            temp *= temp;
            exponent >>= 1;
        }
        return ret;
    }
}