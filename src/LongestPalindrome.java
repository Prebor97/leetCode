public class LongestPalindrome {

    /**

     Given a string s, return the longest palindromic substring in s.

     Example 1:
     Input: s = "babad" Output: "bab" Explanation: "aba" is also a valid answer.

     Example 2:
     Input: s = "cbbd" Output: "bb"

     **/

    public String longestPalindrome(String s){
        if (s==null|| s.isEmpty()){
            return "";
        }
        int start = 0;
        int maxLength = 1;

        for (int i = 0; i < s.length() ; i++){
            int len1 = expandAroundCentre(s,i,i);
            int len2 = expandAroundCentre(s,i,i+1);
            int currentMaxLength = Math.max(len1,len2);

            if (currentMaxLength>maxLength){
                maxLength = currentMaxLength;
                start = i - (currentMaxLength - 1)/2;
            }
        }
        return s.substring(start, start + maxLength);
    }

    public int expandAroundCentre(String s, int left, int right){
        while (left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right - left - 1;
    }

}
