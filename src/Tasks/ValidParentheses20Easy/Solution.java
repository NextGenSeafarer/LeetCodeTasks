package Tasks.ValidParentheses20Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//An input string is valid if:
//
//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.
//Every close bracket has a corresponding open bracket of the same type.
//
//
//        Example 1:
//
//        Input: s = "()"
//        Output: true
//        Example 2:
//
//        Input: s = "()[]{}"
//        Output: true
//        Example 3:
//
//        Input: s = "(]"
//        Output: false
//
//
//        Constraints:
//
//        1 <= s.length <= 104
//        s consists of parentheses only '()[]{}'.
class Solution {
    public static void main(String[] args) {
        System.out.println(isValid("({{{{}}}))"));
    }

    public static boolean isValid(String s) {
        if (s.isEmpty() || s.length() % 2 != 0) return false;
        Stack<Character> characters = new Stack<>();
        char[] ch = s.toCharArray();
        for (char c : ch) {
            if (c == '(' || c == '{' || c == '[') {
                characters.push(c);
                continue;
            }
            switch (c) {
                case ')': {
                    if (!characters.isEmpty() && characters.peek() == '(') {
                        characters.pop();
                        continue;
                    } else {
                        return false;
                    }
                }
                case '}': {
                    if (!characters.isEmpty() && characters.peek() == '{') {
                        characters.pop();
                        continue;
                    } else {
                        return false;
                    }
                }
                case ']': {
                    if (!characters.isEmpty() && characters.peek() == '[') {
                        characters.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        return characters.isEmpty();
    }
}