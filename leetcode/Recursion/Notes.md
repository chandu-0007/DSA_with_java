# 🔁 Recursion in DSA

Recursion is a technique where a function calls itself to solve subproblems. It's widely used in problems involving backtracking, trees, dynamic programming, and divide & conquer.

---

## 📚 Types of Recursion

| Type               | Description                                                         | Example              |
|--------------------|---------------------------------------------------------------------|----------------------|
| Tail Recursion     | Recursive call is the last statement                                | `return f(n-1);`     |
| Head Recursion     | Recursive call before processing                                    | `f(n-1); print(n);`  |
| Tree Recursion     | Function calls itself more than once                                | Fibonacci sequence   |
| Indirect Recursion | A calls B, B calls A (mutual recursion)                             | Rare, theoretical    |
| Nested Recursion   | Recursive call is used as argument of another recursive call        | Ackermann's function |

---

## 🛠️ Common Techniques in Recursion

### 1. Base Case
The condition under which the recursion stops.

if (i == n) return;
 ###  Recursive Call
 Function calls itself with modified parameters to approach base case.
 recurse(i + 1);
  ### 3 Backtracking
 Undo actions after a recursive call. Used in permutations/combinations.

   res.add(val);           // choose
   recurse(...);           // explore 
   res.removeLast();       // un-choose (backtrack)
 ### 4. Memoization
   Store the results of subproblems to avoid re-computation (top-down DP).
  if (dp[i][j] != -1) return dp[i][j];
   dp[i][j] = recurse(...);


 ##  Recursion Tree Explanation
🧪 Problem: Count distinct subsequences
s = "babgbag"
t = "bag"
Recursive function signature:
 
int countSubseq(int i, int j, String s, String t)
Recursion Tree Overview (partial):
arduino
           (0, 0) → s[0]='b', t[0]='b'
            /        \
        (1,1)        (1,0)
        /   \           \
    (2,2)  (2,1)       (2,0)
       |      |
    (3,2)   (3,1)
      |
   (4,3) ✅ (t matched)
Each node = function call with (i, j)

Left branch = include current character if matched

Right branch = skip current character

Leaf node where j == t.length() = valid match ✅

###  Why Use Memoization?
Problem Without Memoization:
Repeats subproblems like subseq(2, 1) from multiple paths.

  Time Complexity: O(2^n)
  Solution:
  Store results in a dp[i][j] table:

  int[][] dp = new int[n][m];
Arrays.fill(dp[i], -1);
With Memoization:
Time Complexity: O(n × m)

Space: O(n × m) (for dp array)

🧠 Tips for Writing Recursive Code
✅ Identify and write the base case first

🔁 Think of the function as solving a smaller version of the problem

🌲 Visualize with recursion trees

🔙 Use backtracking when dealing with permutations/combinations

💾 Use memoization when overlapping subproblems are present

🧪 Test with small inputs and print recursion paths

🧪 Practice Problems (LeetCode)
Problem	Topic
115. Distinct Subsequences	DP + Recursion
17. Letter Combinations of a Phone Number	Backtracking
39. Combination Sum	Recursion + Backtracking
46. Permutations	Recursion + Backtracking
78. Subsets	Recursion + Bitmask
494. Target Sum	DP + Recursion

🧰 Tools to Visualize Recursion
Recursion trees (draw manually)

Print call stack using logs:
System.out.println("Calling f(" + i + ", " + j + ")");
Use debug mode in your IDE

📘 References
CLRS - Introduction to Algorithms

Leetcode Explore Cards

Tushar Roy Recursion Videos

Neetcode.io Recursion Patterns