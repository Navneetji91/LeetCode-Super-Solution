class Solution {
    public double myPow(double x, int m) {

        long n = m;
        boolean negative = false;

        if (n < 0) {
            negative = true;   
            n = -n;
        }

        double answer = 1.0;

        while (n > 0) {
            if (n % 2 == 1) {
                answer = answer * x;
                n = n - 1;
            } else {
                x = x * x;
                n = n / 2;
            }
        }

        return negative ? 1.0 / answer : answer;
    }
}