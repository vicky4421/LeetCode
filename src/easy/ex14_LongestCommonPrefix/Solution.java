package easy.ex14_LongestCommonPrefix;


import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Solution {
    public static String longestCommonPrefix(String[] strs) {
        // e.g. ["flower", "flow", "flight"]
        // first we'll sort the array so that we can only compare the first and last string and not all strings.
        // the sorted array will be ["flight", "flow", "flower"]
        // now no matter how much length of the string we'll only compare first and last string to find out the longest
        // common prefix, this will reduce the time and the time complexity will be O(1)
        Arrays.sort(strs);

        StringBuilder result = new StringBuilder();

        // we'll use string builder to append the result, string builder allows us to mutate the string.

        // now get first and last string and convert it to charArray

        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length-1].toCharArray();

        // compare
        for (int i = 0; i < first.length; i++) {
            if (first[i] == last[i]) result.append(first[i]);
            else break;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String[] strs =  new String[]{"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs));
    }
}
