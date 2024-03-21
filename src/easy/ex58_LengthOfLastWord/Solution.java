package easy.ex58_LengthOfLastWord;

import java.util.ArrayList;

public class Solution {
    public static int lengthOfLastWord(String s) {
        String[] substring = s.split(" ");
        return substring[substring.length-1].length();
    }

    public static void main(String[] args) {
        String s = "luffy is still joyboy";
        System.out.println(lengthOfLastWord(s));
    }
}
