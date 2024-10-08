package easy;

/*
    Given two binary strings a and b, return their sum as a binary string.

    Example 1:

    Input: a = "11", b = "1"
    Output: "100"
    Example 2:

    Input: a = "1010", b = "1011"
    Output: "10101"
 */

public class ex67_AddBinary {

    public static String addBinary(String a, String b){

        StringBuilder result = new StringBuilder();  // To store the binary sum
        int carry = 0;  // Initialize carry
        int i = a.length() - 1;  // Pointer for string a
        int j = b.length() - 1;  // Pointer for string b

        // Loop until both pointers are exhausted or there's no carry left
        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;  // Start with carry

            // Add the binary digit from a if available
            if (i >= 0) {
                sum += a.charAt(i) - '0';  // Convert char to int
                i--;  // Move the pointer for a
            }

            // Add the binary digit from b if available
            if (j >= 0) {
                sum += b.charAt(j) - '0';  // Convert char to int
                j--;  // Move the pointer for b
            }

            // Update carry for the next iteration (sum can be 0, 1, 2, or 3)
            carry = sum / 2;        // if sum is 0 or 1 then there's no carry

            // Append the current binary digit (0 or 1) to the result
            result.append(sum % 2);
        }

        // The result is in reverse order, so reverse it before returning
        return result.reverse().toString();
    }


    public static void main(String[] args) {
        String result = addBinary("1010", "1011");
        System.out.println(result);
    }

}


/*
    Solution Explanation:

    e.g. a = "1010", b = "1011"

    let first do the sum of binary (rn forget about string)

      1 0 1 0           10
    + 1 0 1 1       +   11
    ==========      =======
    1 0 1 0 1           21

    1. 0 + 0 = 1
    2. 1 + 1 = 2 in binary we've only 0 and 1, 2 in binary is 1 0 i.e. we keep 0 and carry 1
    3. 0 + 0 + carry(1) = 1
    4. 1 + 1 = 2 i.e. 10 , we keep 0 and carry 1

    this means we need to maintain a variable carry.
    two variables n1 and n2 for the last index of the string

    we'll be iterating from the last index and moving towards the first index
    we'll add bits and maintain carry if overflow
    we'll loop until n1 greater than 0, n2 greater than 0 and carry greater than 0
    if n1 < 0, end of first string
    if n2 < 0, end of second string
    if carry = 0, no carry left
 */