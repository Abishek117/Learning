/**
 * https://leetcode.com/problems/power-of-three/description/
 *
 * Given an integer n, return true if it is a power of three. Otherwise, return false.
 * An integer n is a power of three, if there exists an integer x such that n == 3x.
 *
 * Example 1:
 * Input: n = 27
 * Output: true
 * Explanation: 27 = 33
 *
 * Example 2:
 * Input: n = 0
 * Output: false
 * Explanation: There is no x where 3x = 0.
 *
 * Example 3:
 * Input: n = -1
 * Output: false
 * Explanation: There is no x where 3x = (-1).
 */

package org.learning;

import java.util.Scanner;

public class PowerOfThree {
    public static boolean isPowerOfThree(int num) {
        if(num < 1){
            return false;
        }
        while(num % 3 == 0){
            num /= 3;
        }
        return num ==1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        System.out.println(isPowerOfThree(n));
    }
}
