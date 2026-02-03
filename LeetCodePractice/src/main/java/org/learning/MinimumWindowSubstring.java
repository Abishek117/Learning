/**
 * Minimum Window Substring
 * https://leetcode.com/problems/minimum-window-substring/description/
 *
 * Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such that every character in t (including duplicates) is included in the window.
 * If there is no such substring, return the empty string "".
 *
 * The testcases will be generated such that the answer is unique.
 *
 * Example 1:
 * Input: s = "ADOBECODEBANC", t = "ABC"
 * Output: "BANC"
 * Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
 *
 * Example 2:
 * Input: s = "a", t = "a"
 * Output: "a"
 * Explanation: The entire string s is the minimum window.
 *
 *
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
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        } else if (s.length() == t.length() && s.length() == 1) {
            if (!s.equals(t)) {
                return "";
            }else{
                return s;
            }
        }
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char x = t.charAt(i);
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        } //           0       8
        //Input: s = "acbbaca", t = "aba"
        int left = 0;
        int right = s.length() - 1;
        String minWindow = "";
        int currentPointer = right;
        String pointerInCharge = "RIGHT";
        HashMap<Character, Integer> hm1 = new HashMap<>();
        boolean leftBorder = false;
        boolean rightBorder = false;
        int bigLeft = 0;
        int bigRight = s.length();
//        while (left < right && left <= currentPointer) {
        while (bigLeft < bigRight) {
            char x = s.charAt(currentPointer);
            if (t.indexOf(x) != -1) {
                hm1.put(x, hm1.getOrDefault(x, 0) + 1);
                if ("RIGHT".equals(pointerInCharge)) {
                    if(!rightBorder){
                        right = currentPointer;
                        rightBorder = true;
                    }
                } else{
                    if(!leftBorder){
                        left = currentPointer;
                        leftBorder = true;
                    }
                }
            }
            if (hm.equals(hm1)) {
                if(minWindow.isEmpty()){
                    minWindow = s.substring(left, s.length());
                }
                if ("RIGHT".equals(pointerInCharge)) {
                    String temp = s.substring(currentPointer, right + 1);
                    if (temp.length() < minWindow.length()) {
                        minWindow = temp;
                    }
                    right = currentPointer - 1;
                    currentPointer = left;
                    pointerInCharge = "LEFT";
                    bigRight--;
                    hm1.clear();
                } else {
                    String temp = s.substring(left, currentPointer + 1);
                    if (temp.length() < minWindow.length()) {
                        minWindow = temp;
                    }
                    left = currentPointer;
                    currentPointer = right;
                    pointerInCharge = "RIGHT";
                    bigLeft++;
                    hm1.clear();
                }
            } else {
                if ("RIGHT".equals(pointerInCharge)) {
                    currentPointer--;
                    bigRight--;
                } else {
                    currentPointer++;
                    bigLeft++;
                }
            }
        }
        return minWindow;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        System.out.println(new MinimumWindowSubstring().minWindow(s, t));
    }

}


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
