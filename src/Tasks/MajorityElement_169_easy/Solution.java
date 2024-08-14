package Tasks.MajorityElement_169_easy;

//Given an array nums of size n, return the majority element.
//
//The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
//
//
//
//Example 1:
//
//Input: nums = [3,2,3]
//Output: 3
//Example 2:
//
//Input: nums = [2,2,1,1,1,2,2]
//Output: 2
//
//
//Constraints:
//
//n == nums.length
//1 <= n <= 5 * 104
//        -109 <= nums[i] <= 109
//
//
//Follow-up: Could you solve the problem in linear time and in O(1) space?


import java.util.*;
import java.util.stream.Stream;

class Solution {

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3, 2, 3, 3, 3, 3, 4, 4}));
    }

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            if (!map.containsKey(n)) {
                map.put(n, 1);
            } else {
                map.put(n, map.get(n) + 1);
            }
        }
        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);
        int max = list.getLast();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                return
                        entry.getKey();
            }
        }
        return 0;
    }
}
