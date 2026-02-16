/**
 * Minimum Window Substring
 * https://leetcode.com/problems/minimum-window-substring/description/
 * <p>
 * Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such that every character in t (including duplicates) is included in the window.
 * If there is no such substring, return the empty string "".
 * <p>
 * The testcases will be generated such that the answer is unique.
 * <p>
 * Example 1:
 * Input: s = "ADOBECODEBANC", t = "ABC"
 * Output: "BANC"
 * Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
 * <p>
 * Example 2:
 * Input: s = "a", t = "a"
 * Output: "a"
 * Explanation: The entire string s is the minimum window.
 * <p>
 * <p>
 * Example 3:
 * Input: s = "a", t = "aa"
 * Output: ""
 * Explanation: Both 'a's from t must be included in the window.
 * Since the largest window of s only has one 'a', return empty string.
 */


package org.learning;

import java.util.HashMap;
import java.util.Scanner;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        System.out.println(new MinimumWindowSubstring().minWindow(s, t));
    }

    public String minWindow(String s, String t) {

        if (s.length() < t.length()) return "";

        // Step 1: Count frequency of characters in t
        HashMap<Character, Integer> need = new HashMap<>();
        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int required = need.size();  // number of unique characters needed
        int formed = 0;              // how many unique chars currently satisfied

        HashMap<Character, Integer> window = new HashMap<>();

        int left = 0, right = 0;
        int minLen = Integer.MAX_VALUE;
        int startIndex = 0;

        while (right < s.length()) {

            char c = s.charAt(right);
            window.put(c, window.getOrDefault(c, 0) + 1);

            // If current char satisfies frequency requirement
            if (need.containsKey(c) &&
                    window.get(c).intValue() == need.get(c).intValue()) {
                formed++;
            }

            // Try shrinking window
            while (left <= right && formed == required) {

                // Update minimum window
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    startIndex = left;
                }

                char leftChar = s.charAt(left);
                window.put(leftChar, window.get(leftChar) - 1);

                if (need.containsKey(leftChar) &&
                        window.get(leftChar) < need.get(leftChar)) {
                    formed--;
                }

                left++;
            }

            right++;
        }

        return minLen == Integer.MAX_VALUE ? ""
                : s.substring(startIndex, startIndex + minLen);

    }


    public String minWindow1(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        } else if (s.length() == t.length() && s.length() == 1) {
            if (!s.equals(t)) {
                return "";
            } else {
                return s;
            }
        }
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char x = t.charAt(i);
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        } //           0       8
        //Input: s = "acbbaca", t = "aba"   Input: s = "cabwefgewcwaefgcf", t = "cae"  aaaaaaaaaaaabbbbbcdd  abcdd
        int right = s.length() - 1;
        int left = s.length() - 1;
        String minWindow = "";
        HashMap<Character, Integer> hm1 = new HashMap<>();
        while (left >= 0) {
            char x = s.charAt(left);
            if (t.indexOf(x) == -1 && hm1.isEmpty()) {
                right--;
                left--;
                continue;
            } else if (t.indexOf(x) == -1) {
                left--;
                continue;
            } else if (hm1.get(x) != null && hm1.getOrDefault(x, 0) + 1 > hm.get(x)) {
                left--;
                continue;
            }
            hm1.put(x, hm1.getOrDefault(x, 0) + 1);
            if (hm.equals(hm1)) {
                if (minWindow.isEmpty()) {
                    minWindow = s.substring(0, s.length());
                }
                String temp = s.substring(left, right + 1);
                if (temp.length() < minWindow.length()) {
                    minWindow = temp;
                }
                right--;
                left = right;
                hm1.clear();
            } else {
                left--;
            }
        }
        return minWindow;
    }

}

/*
Input
s =
"ab"
t =
"a"

Use Testcase
Expected
"a"
 */

/*
Input
s =
"acbbaca"
t =
"aba"

Use Testcase
Expected
"baca"
 */

/*
Input
s =
"cabwefgewcwaefgcf"
t =
"cae"

Use Testcase
Output
"aefgc"
Expected
"cwae"
 */

/*
Input
s =
"aaaaaaaaaaaabbbbbcdd"
t =
"abcdd"

Use Testcase
Output
""
Expected
"abbbbbcdd"
 */
