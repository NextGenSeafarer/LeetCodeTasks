package Tasks.ValidPalindrome_125_easy;

class Solution {
    public static boolean isPalindrome(String s) {

        return s.replaceAll("\\W", "")
                .toLowerCase()
                .contentEquals(new StringBuilder(s.replaceAll("[\\W_]", "")
                        .toLowerCase())
                        .reverse());
    }

    public static void main(String... args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
