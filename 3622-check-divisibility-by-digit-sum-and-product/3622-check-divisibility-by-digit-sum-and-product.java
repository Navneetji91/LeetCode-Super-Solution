class Solution {
    public boolean checkDivisibility(int n) {
        int original=n;
        int sumDigits=0;
        int prodDigits=1;
        while(n>0){
            int digit=n%10;
            sumDigits=sumDigits+digit;
            prodDigits*=digit;
            n/=10;
        }
        int divisor=sumDigits+prodDigits;
        return original%divisor==0;
    }
}