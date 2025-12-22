/**
 *  https://leetcode.com/problems/power-of-two/description/
 *
 * Given an integer n, return true if it is a power of two. Otherwise, return false.
 * An integer n is a power of two, if there exists an integer x such that n == 2x.
 *
 * Example 1:
 * Input: n = 1
 * Output: true
 * Explanation: 20 = 1
 *
 * Example 2:
 * Input: n = 16
 * Output: true
 * Explanation: 24 = 16
 *
 * Example 3:
 * Input: n = 3
 * Output: false
 */

package org.learning;

import java.util.Scanner;
public class PowerOfTwo  {
    public static boolean isPowerOfTwo(int n) {
        // if(n == 1){
        //     return true;
        // }
        // else if(n == 0){
        //     return false;
        // }
        // else if((n % 2) > 0){
        //     return false;
        // } else{
        //     while((n/2) != 1){
        //         n/=2;
        //         if(n%2 ==1){
        //             return false;
        //         }
        //     }
        //     return true;
        // }
        if(n <= 0 ){
            return false;
        }
        return (n & (n-1)) == 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        System.out.println(isPowerOfTwo(n));
    }
}
