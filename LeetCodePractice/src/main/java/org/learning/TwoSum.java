/**
 * https://leetcode.com/problems/two-sum/description/
 *
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 *
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2:
 *
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:
 *
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 */

package org.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int n1 = 0;
        int[] arr = new int[2];
        for (int i = 0 ; i < nums.length ; i++)
        {
            int num1 = nums[i];
            for (int j = 1 ; j < nums.length ; j++)
            {
                int num2 = nums[j];
                int sum = num1 + num2;
                if(i!=j){
                    if(sum==target)
                    {
                        arr[0] = i;
                        arr[1] = j;
                    }
                }
            }
        }
        return arr;
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
        int[] arr = list.stream().mapToInt(Integer::intValue).toArray();
        int target = sc.nextInt();
        System.out.print(Arrays.toString(twoSum(arr,target)));
    }

}
