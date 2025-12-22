/**
 *  https://leetcode.com/problems/longest-palindromic-substring/description/
 *
 * Given a string s, return the longest palindromic substring in s.
 * Example 1:
 * Input: s = "babad"
 * Output: "bab"
 * Explanation: "aba" is also a valid answer.
 *
 * Example 2:
 * Input: s = "cbbd"
 * Output: "bb"
 */

package org.learning;

import java.util.Scanner;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String str) {
        if (isPalindrome(str)) {
            return str;
        }

        int length = 0;
        String longestPalindromeSubStr = String.valueOf(str.charAt(0));

        for(int i = 0; i< str.length()-1; i++){
            for(int j = str.length()-1; j >=0 ; j--){
                if((j != i && j > i)){
                    String subStr = str.substring(i, j+1);
                    if(isPalindrome(subStr)){
                        if (subStr.length() > length) {
                            length = subStr.length();
                            longestPalindromeSubStr = subStr;
                        }
                    }
                }else{
                    break;
                }
            }
        }
        return longestPalindromeSubStr;
    }

    public boolean isPalindrome(String str){
        int left = 0;
        int right = str.length()-1;
        while(left != right && left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            } else{
                left++;
                right--;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
        System.out.println(lps.longestPalindrome(str));
    }
}
