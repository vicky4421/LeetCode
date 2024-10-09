package easy;

/*
    Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
    You must write an algorithm with O(log n) runtime complexity.

    Input: nums = [-1,0,3,5,9,12], target = 9
    Output: 4
    Explanation: 9 exists in nums and its index is 4
 */

public class ex401_BinarySearch {
    public static int binarySearch(int[] nums, int target){

        int left = 0;
        int right = nums.length - 1;
        int i = left + (right - left) / 2;

        while (left <= right){
            if (nums[i] < target){
                left = i;
                i = (right - left) / 2;
            } else if (nums[i] > target) {
                right = i;
                i = (right - left) / 2;
            } else {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(binarySearch(nums, target));
    }
}
