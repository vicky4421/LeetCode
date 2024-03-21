package easy.ex69_SquareRoot;

public class Solution {
    public static int mySqrt(int x){
        long start = 1;
        long end = x;
        long answer = 0;

        while (start <= end){
            long mid = start + end / 2;
            if (mid * mid == x){
                answer = mid;
                break;
            } else if (mid * mid < x) {
                start = mid + 1;
                answer = mid;
            } else {
                end = mid - 1;
            }
        }
        return (int) answer;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }
}
