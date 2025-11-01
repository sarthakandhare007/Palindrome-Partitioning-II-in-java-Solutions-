# Palindrome-Partitioning-II-in-java-Solutions-
🧩 Problem Statement:

Given a string s, partition it such that every substring of the partition is a palindrome.
Return the minimum number of cuts needed to make every substring a palindrome.


---

🔹 Example 1:

Input: s = "aab"
Output: 1

Explanation:
"aab" → ["aa", "b"]
Only 1 cut needed.


---

🔹 Example 2:

Input: s = "a"
Output: 0


---

💡 Approach:

We’ll use Dynamic Programming — two phases:

1. Palindrome Precomputation (O(n²)):
Use a DP table isPal[i][j] to check if substring s[i…j] is a palindrome.


2. Min Cuts (O(n²)):
Use another array cuts[i] to store the minimum cuts for substring s[0…i].



Transitions:

If substring s[0…i] is a palindrome → no cuts needed → cuts[i] = 0

Else, for each j < i:

if (s[j+1…i] is palindrome)
    cuts[i] = min(cuts[i], cuts[j] + 1)
✅ Output:

1
0
2


---

⚙️ Complexity:

Type	Complexity

Time	O(n²)
Space	O(n²)



---

🧠 Key Idea:

Precompute all palindromes efficiently using isPal DP.

Then use another DP (cuts) to compute minimum cuts needed.

Avoids recomputation and runs in O(n²).



---

💬 Quick Dry Run Example (s = "aab"):

Substring	Palindrome?	Cuts

a	✅	0
aa	✅	0
aab	❌ ("b" breaks) → needs 1 cut between “aa” and “b”	


Final Answer = 1 ✅

