/**
 *  https://leetcode.com/problems/3sum-closest/description/
 *
 * Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.
 * Return the sum of the three integers.
 * You may assume that each input would have exactly one solution.
 *
 * Example 1:
 * Input: nums = [-1,2,1,-4], target = 1
 * Output: 2
 * Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 * Example 2:
 *
 * Input: nums = [0,0,0], target = 1
 * Output: 0
 * Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).
 */

package org.learning;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThreeNumSumClosest {
    public int threeSumClosest(int[] arr, int target) {
        int sum = 0;
        boolean sumFlag = true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    int tempSum = arr[i] + arr[j] + arr[k];
                    if (sumFlag) {
                        sum = tempSum;
                        sumFlag = false;
                        continue;
                    }
                    int prev = target - sum;
                    int next = target - tempSum;
                    if (Math.abs(next) < Math.abs(prev)) {
                        sum = tempSum;
                    }
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (true) {
            String num = sc.nextLine();
            if (num.equals("null")) {
                break;
            }
            list.add(Integer.parseInt(num));
        }
        System.out.println(list);
//        System.out.print("Enter target : ");
        int target = Integer.parseInt(sc.nextLine());
        int[] arr = list.stream().mapToInt(Integer::intValue).toArray();
        ThreeNumSumClosest closestTriplets = new ThreeNumSumClosest();
        int sum = closestTriplets.threeSumClosest(arr, target);
        System.out.println("Result is " + sum);

    }
}