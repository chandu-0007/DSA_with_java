// This code solves the "Distinct Subsequences" problem using Dynamic Programming
// Time Complexity: O(m*n) where m and n are lengths of strings s and t
// Space Complexity: O(m*n) for the dp array
import java.util.Arrays;;

class Solution {
    // Recursive function with memoization to count distinct subsequences
    public static int subseq(int i, int j, String s, String t, int[][] dp) {
        // Base cases
        if (j == t.length()) return 1;    // Found a valid subsequence
        if (i == s.length()) return 0;    // Reached end of source string
        
        // Return memoized result if available
        if (dp[i][j] != -1) return dp[i][j];
        
        int count = 0;
        // If characters match, we can include or exclude current character
        if (s.charAt(i) == t.charAt(j)) {
            count += subseq(i + 1, j + 1, s, t, dp);  // Include current char
        }
        
        // Always try excluding current character
        count += subseq(i + 1, j, s, t, dp);
        
        // Memoize and return result
        return dp[i][j] = count;
    }
    
    public int numDistinct(String s, String t) {
        // Initialize DP array with -1
        int[][] dp = new int[s.length()][t.length()];
        for (int[] row : dp) Arrays.fill(row, -1);
        
        // Start recursion from beginning of both strings
        return subseq(0, 0, s, t, dp);
    }
}