package easy.ex70_ClimbingStairs;

/*
    We've to find how many ways to climb the stairs to reach top for given no. of steps.
    We can calculate no. of ways to climb the 1-step stair is 1.
    We can calculate no. of ways to climb the 2-step stair is 2.
        1 - 1, 1    ( one step at a time )
        2 - 2       ( two steps at a time and one step )
    We can calculate no. of ways to climb the 2-step stair is 2.
    We can calculate no. of ways to climb the 3-step stair is 3.
    The pattern here creates that for the no. ways to climb 3-step stair is 2 + 1
        i.e. no.of ways for 2-step + no. ways for 1-step
        i.e. no.of ways for (n-1) step + no. of ways for (n-1)
    To understand this lets take example of 7-step stair.
        when we at step no 6, to reach at the top we can do it with one way (one step at a time)
        when we at step no 5, to reach at the top we can do it with two ways (one step at a time and
            two steps at a time)
        when we at step no 4, to reach at the top we can do it with three ways.
    To find no. of ways at the to reach at top from step 6 or step 5 we can do it easy way with memoizing.
        i.e. we can store no. of ways to reach at the top from step 1 then step 2 and so on.
        so to calculate no. of ways to reach at the top for n steps, we'll have its prev steps ways.

        as we can calculate no. ways for 1 and 2 we can store it and find it for next.
        and we'll start loop from 3

    Fibonacci series.
 */

public class Solution {
    public static int climbStairs(int n) {
        if (n == 1) return 1;

        // to memoize
        int[] noOfWays = new int[n + 1];
        noOfWays[1] = 1;                        // for 1 steps stair
        noOfWays[2] = 2;                        // for 2 steps stair

        // for n steps stair
        for (int i = 3; i <= n; i++) {
            noOfWays[i] = noOfWays[i-1] + noOfWays[i-2];
        }

        return noOfWays[n];
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(1));
        System.out.println(climbStairs(2));
        System.out.println(climbStairs(3));
        System.out.println(climbStairs(4));
        System.out.println(climbStairs(5));
        System.out.println(climbStairs(6));
        System.out.println(climbStairs(7));
        System.out.println(climbStairs(8));
    }
}
