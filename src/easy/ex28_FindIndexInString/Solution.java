package easy.ex28_FindIndexInString;

public class Solution {
    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        System.out.println(strStr("aaa", "aaaa"));
    }
}
