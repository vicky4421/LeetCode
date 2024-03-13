package easy.ex9_Palindrome_Number;

public class Solution {

    public static boolean isPalindrome(int x) {        // suppose x = 121
        int target = x;
        int palindrome = 0;
        while (x > 0){
            int temp = x % 10;                  // modulus gives us last number i.e.1
            x = x/10;                           // dividing by 10 will remove last digit
            palindrome = palindrome * 10 + temp;
        }
        return palindrome == target;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
    }
}

/*
    We've to first reverse the number.
    To reverse the number we first get the last digit by modulus and stored it in temporary variable.
    Then we divided the original number by 10, so we removed the last digit from original number.
    Now we've to put the temporary number i.e. last digit to its correct position in the reversed number,
    to do that we need to multiply the reversed number (palindrome) by 10 so that the place of the temporary
    number would be at the next digit of the reversed number, and we'll add temporary number.
    i.e. if we have reversed number 31, and we need to add the next digit(5) i.e. after 1 we need to multiply
    the reversed number by 10, so it'll become 310, and we add 5 to it, so it'll become 315.
 */
