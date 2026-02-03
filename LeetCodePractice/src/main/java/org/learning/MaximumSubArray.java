/**
 * https://leetcode.com/problems/maximum-subarray/description/

 * Given an integer array nums, find the subarray with the largest sum, and return its sum.

 * Example 1:
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 * Explanation: The subarray [4,-1,2,1] has the largest sum 6.

 * Example 2:
 * Input: nums = [1]
 * Output: 1
 * Explanation: The subarray [1] has the largest sum 1.

 * Example 3:
 * Input: nums = [5,4,-1,7,8]
 * Output: 23
 * Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
 */


package org.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MaximumSubArray {

    /*  // my implementation
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return nums.length;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int flag = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (flag < nums[i]) {
                flag = nums[i];
            }
            int sumOfJ = 0;
            for (int j = 1; j < nums.length; j++) {
                if (i < j) {
                    sumOfJ += nums[j];
                    int temp = nums[i] + sumOfJ;
                    if (flag < temp) {
                        flag = temp;
                    }
                }
            }
        }
        return flag;
    }
    */

    //optimized implementation by "Kadane logic". Use th
    // //Kadane’s algorithm is used when You are asked to find the maximum sum of a contiguous subarray.is for a problems with finding sequential subarray which maintains its order
    /*Typical keywords in problems:
    “maximum subarray”
    “largest sum of contiguous elements”
    “best profit from continuous segment”
    “max sum window”
    “longest segment with best score”*/
    public int maxSubArray1(int[] nums) { //nums = [-2,1,-3,4,-1,2,1,-5,4]
        if (nums.length == 0) {
            return nums.length;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int currMaxSum = nums[0];                                  // 15
        int maxSum = nums[0];                                   // 15
        for (int i = 1; i < nums.length; i++) {
            currMaxSum = Math.max(nums[i], currMaxSum + nums[i]);     // 8, (15+8) = 23
            maxSum = Math.max(currMaxSum, maxSum);                 // 23, 15    = 23
        }
        return maxSum;
    }

    public int maxSubArray2(int[] nums) { //nums = [-2,1,-3,4,-1,2,1,-5,4]
        if (nums.length == 0) {
            return nums.length;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int currMaxSum = nums[0];
        int maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currMaxSum = Math.max(nums[i], currMaxSum + nums[i]);
            maxSum = Math.max(currMaxSum, maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        while (true) {
            String num = sc.nextLine();
            if ("null".equals(num)) {
                break;
            }
            list.add(Integer.parseInt(num));
        }

        int[] numArr = list.stream().mapToInt(n -> n.intValue()).toArray();
        MaximumSubArray maximumSubArray = new MaximumSubArray();
        System.out.print(maximumSubArray.maxSubArray1(numArr));
    }
}
