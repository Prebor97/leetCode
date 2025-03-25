public class IntConversion {
    /**

     String to Integer (atoi)

     Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer.
     The algorithm for myAtoi(string s) is as follows:

     Whitespace: Ignore any leading whitespace (" ").Signedness: Determine the sign by checking if
     the next character is '-' or '+', assuming positivity if neither present.Conversion: Read
     the integer by skipping leading zeros until a non-digit character is encountered or the end
     of the string is reached. If no digits were read, then the result is 0.Rounding: If the
     integer is out of the 32-bit signed integer range [-231, 231 - 1], then round the integer
     to remain in the range. Specifically, integers less than -231 should be rounded to -231,
     and integers greater than 231 - 1 should be rounded to 231 - 1.

     Return the integer as the final result.
     Example 1:
     Input: s = "42"
     Output: 42

     **/

    public int getIntConversion(String s) {
        int i = 0, n = s.length(), sign = 1;
        long result = 0;

        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        if (i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        while (i < n && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');

            if (sign * result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            if (sign * result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            i++;
        }

        return (int) (sign * result);
    }
}
