/**
 * https://leetcode.com/problems/product-of-array-except-self/
 *
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
 *
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 *
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 *
 * Example 1:
 * Input: nums = [1,2,3,4]
 * Output: [24,12,8,6]
 *
 * Example 2:
 * Input: nums = [-1,1,0,-3,3]
 * Output: [0,0,9,0,0]
 */

package org.learning;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.IntBinaryOperator;
import java.util.stream.Collectors;

public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i < nums.length; i++){
//            List<Integer> numList = Arrays.stream(nums).boxed().toList();
            List<Integer> numList = Arrays.stream(nums).boxed().collect(Collectors.toList());
            int d = numList.remove(i);
            int a = numList.stream().mapToInt(n -> n).reduce(1, (n1, n2) -> n1*n2);
            list.add(a);
        }
        return list.stream().mapToInt(n -> n).toArray();
    }

    public int[] productExceptSelf1(int[] nums) {
        return nums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        while(true){
            String input = sc.nextLine();
            if("null".equalsIgnoreCase(input)){
                break;
            }
            list.add(Integer.parseInt(input));
        }

        int[] nums = list.stream().mapToInt(s -> s).toArray();
        ProductOfArrayExceptSelf poae = new ProductOfArrayExceptSelf();
        System.out.println(Arrays.stream(poae.productExceptSelf(nums)).boxed().collect(Collectors.toList()));

    }

}

