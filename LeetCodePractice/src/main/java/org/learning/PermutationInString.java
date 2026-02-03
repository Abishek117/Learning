/**
 * https://leetcode.com/problems/permutation-in-string/description/
 *
 * Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
 *
 * In other words, return true if one of s1's permutations is the substring of s2.
 *
 * Example 1:
 *
 * Input: s1 = "ab", s2 = "eidbaooo"
 * Output: true
 * Explanation: s2 contains one permutation of s1 ("ba").
 * Example 2:
 *
 * Input: s1 = "ab", s2 = "eidboaoo"
 * Output: false
 */


package org.learning;

import java.util.HashMap;
import java.util.Scanner;

public class PermutationInString {

    public boolean checkInclusion(String s1, String s2) {
        if(s1.equals(s2)){
            return true;
        }
        int i = 0;
        int lengthOfS1 = s1.length();
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int x =0; x<s1.length(); x++){
            char c1 = s1.charAt(x);
            hm.put(c1, hm.getOrDefault(c1,0)+1);
        }
        if(lengthOfS1 == s2.length()){
            HashMap<Character, Integer> hm2 = new HashMap<>();
            for(int x =0; x<s1.length(); x++){
                char c1 = s1.charAt(x);
                hm2.put(c1, hm2.getOrDefault(c1,0)+1);
            }
            if(hm.equals(hm2)){
                return true;
            }
        }
        boolean result = false;
        while(!result && i <= s2.length()-lengthOfS1){
            String temp = s2.substring(i,i+lengthOfS1);
            HashMap<Character, Integer> hm1 = new HashMap<>();
            for(int y =0; y<temp.length(); y++){
                char c1 = temp.charAt(y);
                hm1.put(c1, hm1.getOrDefault(c1,0)+1);
            }
            if(hm.equals(hm1)){
                return true;
            }
            i++;
        }
        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(new PermutationInString().checkInclusion(s1.toLowerCase(),s2.toLowerCase()));
    }



}
