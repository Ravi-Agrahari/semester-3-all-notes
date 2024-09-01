/*
Palindrome Substring Algorithm: Manacher's Algorithm
*****************************************************

    Manacher's Algorithm: Step-by-Step Explanation
    ===============================================
    
        Step 1: Preprocessing the String
        ---------------------------------
            -> Input:
                - Original string S of length n.
            -> Output:
                - Transformed string T of length 2n+1.
                - The transformed string includes a separator (like '#') between each character of S
                  and also at the start and end. This transformation helps in handling even-length palindromes.

            -> Transformation Example:
                - Original String S: "abba"
                - Transformed String T: "^#a#b#b#a#$"
                - Here, '^' and '$' are added as boundaries to avoid bounds checking.

        Step 2: Initialize Variables
        ----------------------------
            -> Input:
                - Transformed string T of length m (where m = 2n+1).
            -> Initialize:
                - P array of length m (P[i] will store the radius of the palindrome centered at T[i]).
                - Center (C) = 0 (the center of the current rightmost palindrome).
                - Right (R) = 0 (the right edge of the current rightmost palindrome).

        Step 3: Expand Around the Center
        ---------------------------------
            -> Iterate through the transformed string T to expand potential palindromes:
                - For each index i:
                    a. Find the mirror index i_mirror = 2*C - i (i_mirror is the mirror of i with respect to C).
                    b. If i is within the right boundary (R > i):
                        * Set P[i] = min(R - i, P[i_mirror]) to avoid unnecessary comparisons.
                    c. Attempt to expand the palindrome centered at i:
                        * While T[i + P[i] + 1] == T[i - P[i] - 1], increase P[i].
                    d. If the palindrome centered at i expands beyond R:
                        * Update the center C and the right boundary R.

        Step 4: Find the Longest Palindrome
        -----------------------------------
            -> After iterating through T, find the maximum value in the P array, which gives the length of the longest palindrome in S.
            -> Extract the starting index of the palindrome in the original string S using the maximum length found.

    Time Complexity:
    ----------------
        -> The time complexity of Manacher's Algorithm is O(n), where n is the length of the original string S.

    Example Walkthrough:
    ---------------------
        -> Original String: "abba"
        -> Transformed String: "^#a#b#b#a#$"
        -> Calculate P array by expanding around centers.
        -> Output the longest palindromic substring.

*/

/*
    Problem: Given a string, find the longest palindromic substring using Manacher's algorithm.
        Example:
            Input: String = "babad"
            Output: "bab" or "aba" (both are valid palindromic substrings)
*/

#include <iostream>
#include <string>
#include <vector>

using namespace std;

// Function to preprocess the string (add separators and boundaries)
string preprocessString(const string& s)
{
    if (s.empty()) return "^$";
    string ret = "^";
    for (int i = 0; i < s.length(); i++)
        ret += "#" + s.substr(i, 1);
    ret += "#$";
    return ret;
}

// Function to find the longest palindromic substring using Manacher's algorithm
string longestPalindrome(string s)
{
    // Step 1: Preprocess the string
    string T = preprocessString(s);
    int n = T.length();
    vector<int> P(n, 0); // Array to store the radius of the palindrome centered at each character in T
    int C = 0, R = 0; // Center and right boundary of the current rightmost palindrome

    // Step 2: Expand around each center
    for (int i = 1; i < n - 1; i++)
    {
        int i_mirror = 2 * C - i; // Mirror index of i with respect to center C

        if (R > i)
            P[i] = min(R - i, P[i_mirror]);

        // Step 3: Attempt to expand palindrome centered at i
        while (T[i + 1 + P[i]] == T[i - 1 - P[i]])
            P[i]++;

        // Step 4: If the palindrome centered at i expands past R, update center and right boundary
        if (i + P[i] > R)
        {
            C = i;
            R = i + P[i];
        }
    }

    // Step 5: Find the maximum palindrome length in the P array
    int maxLen = 0;
    int centerIndex = 0;
    for (int i = 1; i < n - 1; i++)
    {
        if (P[i] > maxLen)
        {
            maxLen = P[i];
            centerIndex = i;
        }
    }

    // Step 6: Extract the longest palindrome from the original string
    int start = (centerIndex - maxLen) / 2; // Convert from the transformed string index to the original string index
    return s.substr(start, maxLen);
}

int main()
{
    string s = "babad"; // The input string

    // Call the Manacher's algorithm function
    string result = longestPalindrome(s);

    // Output the longest palindromic substring
    cout << "The longest palindromic substring is: " << result << endl;

    return 0;
}
