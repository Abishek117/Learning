/**
 *  https://leetcode.com/problems/add-two-integers/description/
 *
 *  Given two integers num1 and num2, return the sum of the two integers.
 *
 * Example 1:
 * Input: num1 = 12, num2 = 5
 * Output: 17
 * Explanation: num1 is 12, num2 is 5, and their sum is 12 + 5 = 17, so 17 is returned.
 *
 * Example 2:
 * Input: num1 = -10, num2 = 4
 * Output: -6
 * Explanation: num1 + num2 = -6, so -6 is returned.
 */

package org.learning;

import java.util.Scanner;

public class AddTwoIntegers {
    public int sum(int num1, int num2) {
        int num3 = num1 + num2;
        return num3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = Integer.parseInt(sc.nextLine());
        int a2 = Integer.parseInt(sc.nextLine());
        AddTwoIntegers s = new AddTwoIntegers();
        System.out.println(s.sum(a1,a2));
    }
}
