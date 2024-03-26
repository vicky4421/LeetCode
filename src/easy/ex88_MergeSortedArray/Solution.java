package easy.ex88_MergeSortedArray;

import java.util.Arrays;

public class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = 0;
        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[index];
            index++;
        }
        Arrays.sort(nums1);
    }

    /*
        Optimized solution
        https://www.youtube.com/watch?v=0H6038ldSyg
     */

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;

        merge(nums1, m, nums2, n);

        System.out.println(Arrays.toString(nums1));
    }
}
