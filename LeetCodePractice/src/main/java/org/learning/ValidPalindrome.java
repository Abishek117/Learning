package org.learning;

import java.util.Scanner;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left <= right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
            if (!Character.isLetterOrDigit(leftChar) || !Character.isLetterOrDigit(rightChar)) {
                if (!Character.isLetterOrDigit(leftChar)) {
                    left++;
                }
                if (!Character.isLetterOrDigit(rightChar)) {
                    right--;
                }
                continue;
            }
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(new ValidPalindrome().isPalindrome(str.toLowerCase()));
    }
}
