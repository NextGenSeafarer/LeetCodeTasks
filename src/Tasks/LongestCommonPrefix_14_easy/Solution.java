package Tasks.LongestCommonPrefix_14_easy;

//Write a function to find the longest common prefix string amongst an array of strings.
//
//If there is no common prefix, return an empty string "".
//
//
//
//Example 1:
//
//Input: strs = ["flower","flow","flight"]
//Output: "fl"
//Example 2:
//
//Input: strs = ["dog","racecar","car"]
//Output: ""
//Explanation: There is no common prefix among the input strings.
//
//
//        Constraints:
//
//        1 <= strs.length <= 200
//        0 <= strs[i].length <= 200
//strs[i] consists of only lowercase English letters.


import java.util.*;
import java.util.stream.Collectors;

class Solution {

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"ab", "a"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        String prefix = "";
        String lastCorrectPrefix = "";
        int toPrefix = 1;
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));
        while (true) {
            for (int i = 0; i < strs.length; i++) {
                if (strs[i].isEmpty()) {
                    return "";
                }
                prefix = strs[i].substring(0, toPrefix);
            }
            for (int i = 0; i < strs.length; i++) {
                if (strs[i].startsWith(prefix)) {
                    if (prefix.length() >= strs[i].length()) {
                        return prefix;
                    }
                    if (i == strs.length - 1) {
                        toPrefix++;
                        lastCorrectPrefix = prefix;
                    }
                } else {
                    return lastCorrectPrefix;
                }
            }
        }
    }
}
