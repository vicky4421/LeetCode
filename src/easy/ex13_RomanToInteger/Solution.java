package easy.ex13_RomanToInteger;

public class Solution {

    public static int getValue(char c){
        switch (c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
    public static int romanToInt(String s) {
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((i+1) < s.length() && getValue(s.charAt(i)) < getValue(s.charAt(i+1)))
            /*
                cond 1: if i+1 < s.length :
                    e.g. s = IV
                        s.length() = 2
                        i+1 = 0+1 < 2 == true
                        i.e. the next digit exists
                cond 2: if charAt(i) < charAt(i+1) == true
                    then I's value should be be subtracted from sum
                    I = 1 < V = 5
                    in roman I before V is '-I' i.e. IV = 5-1 =4

                    if VI then I = +1 i.e. VI = 5+1=6
             */
            {
                sum -= getValue(s.charAt(i));
            } else {
                sum += getValue(s.charAt(i));
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }
}
