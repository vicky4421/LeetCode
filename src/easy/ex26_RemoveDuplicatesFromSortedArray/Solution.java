package easy.ex26_RemoveDuplicatesFromSortedArray;

/*
    Given an integer array sorted in increasing order.
    We need to remove duplicates from the array and return the same array with same length.
    and return the no. of duplicate elements.
 */
public class Solution {

    /*
        The approach to resolve this we'll loop through the given array and check if the current element is equal to the next
        element in array, if it is we'll skip the loop and go to next element and do the same.
        it the current element is not equal to the next element then we'll save it to the array at the position where we found
        the duplicate.
     */

    public static int removeDuplicates(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            // the first condition is if i < length of num[] we'll add the last element as it is as it won't have duplicate.
            // in else we'll store the current element at count position.

            if (i < nums.length-1 && nums[i] == nums[i+1]) continue;
            else {
                nums[count] = nums[i];
                count++;
            }
        }

        return count;
    }

    /*
        dry run:
        suppose we've array [1,1,2,3,3,4,4,4,5]
        first count is 0
        i == 0
            1 == 1
            nums[i] == nums[i+1] -> 2nd condition true we'll skip
        i == 1
            1 != 2
            else num[1] = num[0]
            [1]
            count = 1
        i == 2
            2 != 3
            else num[2] = num[1]
            [1, 2]
            count = 2
        i == 3
            3 == 3
            continue
        i == 4
            3 != 4
            else num[4] = num[2]
            [1, 2, 3]
            count = 3
        i == 5
            4 == 4
            continue
        i == 6
            4 == 4
            continue
        i == 7
            4 != 5
            else num[7] = num[3]
            [1, 2, 3, 4]
            count = 4

         Until now there are four duplicates in the list and with remaining element count will 5
     */

    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,4,5};
        System.out.println(removeDuplicates(nums));     // 5
    }

    /*
        Optimized solution
        class Solution {
            public int removeDuplicates(int[] nums) {
                int k=0;
                for(int i=1;i<nums.length;i++){
                    if(nums[k]!=nums[i]){
                        k++;
                        nums[k]=nums[i];
                    }
                }
                return k+1;
            }
        }
     */

}
