/**
 * https://leetcode.com/problems/group-anagrams/description/
 *
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 *
 * Example 1:
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 * Explanation:
 * There is no string in strs that can be rearranged to form "bat".
 * The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
 * The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
 *
 * Example 2:
 * Input: strs = [""]
 * Output: [[""]]
 *
 * Example 3:
 * Input: strs = ["a"]
 * Output: [["a"]]
 */

package org.learning;

import java.util.*;
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        HashMap<String, List<String>> hm = new HashMap<>();
        for (String s : strs) {
            char[] chArr = s.toCharArray();
            Arrays.sort(chArr);
            String key = new String(chArr);

            hm.computeIfAbsent(key, v -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(hm.values());

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        while (true) {
            String str = sc.nextLine();
            if (str.equals("null")) {
                break;
            }
            list.add(str);
        }

        String[] strArr = list.stream().toArray((int s) -> new String[s]);
            /*
            - We know that toArray accepts IntFunction (which accepts int as an argument and return any type) as an argument
            - Ok that's fine..we can ask how we can pass an "int" from this stream which contains Strings

            When you call .toArray(...), the Stream does three things:
                - It counts how many items are in the stream (let's say there are 5 items). [toArray method in witten like that only]
                - It then calls your lambda and says: "Hey, I have 5 items. Use this number 5 to create the right-sized array for me."
                - now adds the elements currently in the stream inside the created array
             */

        GroupAnagrams ga = new GroupAnagrams();
        List<List<String>> res = ga.groupAnagrams(strArr);
        if (!res.isEmpty()) {
            System.out.println(res);
        } else {
            res.add(Collections.emptyList());
            System.out.println(res);
        }
    }
}
