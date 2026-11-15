/*
 * Problem: Greatest Common Divisor of Strings
 * LeetCode: 1071
 * Difficulty: Easy
 * Pattern: String Manipulation
 *
 * Time Complexity: O(n + m)
 * Space Complexity: O(n + m)
 */

class Solution {
    public String gcdOfStrings(String str1, String str2) {

        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        int len= gcd(str1.length(), str2.length());
        return str1.substring(0,len);
    }
    //O(n+m)

    // Helper method to calculate GCD- Euclidean algorithm
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    //O(min(m,n))
}