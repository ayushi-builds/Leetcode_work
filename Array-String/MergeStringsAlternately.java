/*
 * Problem: Merge Strings Alternately
 * LeetCode: 1768
 * Difficulty: Easy
 * Pattern: String Manipulation
 *
 * Time Complexity: O(n + m)
 * Space Complexity: O(n + m)
 */

class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder(); // O(1)
        int maxlength= Math.max(word1.length(), word2.length()); // O(max(m,n))
        for (int i=0; i <maxlength; i++) {
            if (i<word1.length()) {
                result.append(word1.charAt(i));
            }
            if (i<word2.length()) {
                result.append(word2.charAt(i));
            }
        }
        return result.toString(); // O(n+m)
    }
}