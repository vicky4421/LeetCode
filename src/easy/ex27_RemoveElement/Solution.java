package easy.ex27_RemoveElement;

/*
    we need to remove all occurrences of val in array nums.
    and return the no of elements which are not equal to val.
 */

public class Solution {
    public static int removeElement(int[] nums, int val){
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val){
                continue;
            } else {
                nums[count] = nums[i];
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        System.out.println(removeElement(nums, val));
        for(int i : nums){
            System.out.print(i + " ");
        }
    }
}
