package easy.ex35_SearchInsertPosition;

public class Solution {
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            int mid = (start + end) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] > target) end = mid - 1;
            if (nums[mid] < target) start = mid + 1;
        }
        return start;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        int target = 0;
        System.out.println(searchInsert(nums, target));
    }
}
