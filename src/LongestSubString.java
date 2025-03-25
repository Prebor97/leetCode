import java.util.HashSet;
import java.util.Set;

/**

 Given a string s, find the length of the longest substring without duplicate characters.
 Example 1:
 Input: s = "abcabcbb" Output: 3 Explanation: The answer is "abc", with the length of 3.

 Example 2:
 Input: s = "bbbbb" Output: 1 Explanation: The answer is "b", with the length of 1.

 **/

public class LongestSubString {
    public int lengthOfLongestSubString (String s){
        Set<Character> charSet = new HashSet<>();
        int maxLength = 0;
        int left = 0;
        for (int right = 0 ; right < s.length() ; right++){
            while (charSet.contains(s.charAt(right))){
                charSet.remove(s.charAt(left));
                left++;
            }
            charSet.add(s.charAt(right));
            maxLength = Math.max(maxLength, right-left +1);
        }
        return maxLength;
    }
}
