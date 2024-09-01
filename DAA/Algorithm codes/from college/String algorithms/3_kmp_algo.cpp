/*
String Matching Algorithm: Knuth-Morris-Pratt (KMP) Algorithm
*************************************************************

    KMP Algorithm: Step-by-Step Explanation
    =======================================
    
        Step 1: Preprocessing the Pattern (Compute LPS Array)
        ----------------------------------------------------
            -> Input: 
                - Pattern P of length m
            -> Output:
                - LPS array (Longest Prefix Suffix array) where LPS[i] represents the length of the longest prefix
                  which is also a suffix for the substring P[0...i].

            -> Initialize:
                - LPS[0] = 0 (The longest prefix which is also a suffix for the first character is always 0)
                - len = 0 (length of the previous longest prefix suffix)
                - i = 1 (start calculating LPS from the second character)

            -> LPS Construction:
                - While i < m:
                    - If P[i] == P[len]: (characters match)
                        * Increment len by 1 and set LPS[i] = len
                        * Increment i by 1
                    - Else:
                        * If len != 0, set len to LPS[len-1] (try to find the previous longest prefix suffix)
                        * Else, set LPS[i] = 0 and increment i

        Step 2: Pattern Matching Using the LPS Array
        --------------------------------------------
            -> Input: 
                - Text T of length n
                - Pattern P of length m
                - LPS array computed in Step 1

            -> Initialize:
                - i = 0 (index for T)
                - j = 0 (index for P)

            -> Matching Process:
                - While i < n:
                    - If P[j] == T[i]: (characters match)
                        * Increment both i and j
                    - If j == m: (found a match)
                        * Pattern found at index i - j in T
                        * Set j to LPS[j-1] to continue searching for more matches
                    - Else if P[j] != T[i]: (characters don't match)
                        * If j != 0, set j to LPS[j-1]
                        * Else, increment i

    Time Complexity:
    ----------------
        -> Preprocessing (LPS computation): O(m)
        -> Pattern matching: O(n)
        -> Overall: O(n + m)

    Example Walkthrough:
    ---------------------
        -> Text: "ABABDABACDABABCABAB"
        -> Pattern: "ABABCABAB"
        -> Compute LPS array for the pattern.
        -> Use the LPS array to efficiently search for the pattern in the text.
        -> Output the starting index of matches.

*/

/*
    Problem: Given a text and a pattern, find all occurrences of the pattern in the text using the KMP algorithm.
        Example:
            Input: Text = "ABABDABACDABABCABAB", Pattern = "ABABCABAB"
            Output: Pattern found at index 10
*/

#include <iostream>
#include <vector>
#include <string>

using namespace std;

// Function to compute the LPS (Longest Prefix Suffix) array
void computeLPSArray(string pattern, int m, vector<int>& lps)
{
    int len = 0; // Length of the previous longest prefix suffix
    lps[0] = 0;  // LPS[0] is always 0
    int i = 1;

    // Step 1: Calculate LPS array
    while (i < m)
    {
        if (pattern[i] == pattern[len])
        {
            len++;
            lps[i] = len;
            i++;
        }
        else // (pattern[i] != pattern[len])
        {
            if (len != 0)
            {
                len = lps[len - 1];
            }
            else
            {
                lps[i] = 0;
                i++;
            }
        }
    }
}

// Function to search for pattern using KMP algorithm
void KMPSearch(string text, string pattern)
{
    int n = text.length();   // Length of the text
    int m = pattern.length(); // Length of the pattern

    // Step 2: Create the LPS array
    vector<int> lps(m);
    computeLPSArray(pattern, m, lps);

    int i = 0; // Index for text
    int j = 0; // Index for pattern

    // Step 3: Search the pattern in the text
    while (i < n)
    {
        if (pattern[j] == text[i])
        {
            i++;
            j++;
        }

        if (j == m)
        {
            cout << "Pattern found at index " << i - j << endl;
            j = lps[j - 1]; // Use the LPS array to skip characters
        }
        else if (i < n && pattern[j] != text[i]) // Mismatch after j matches
        {
            if (j != 0)
                j = lps[j - 1]; // Use the LPS array to skip characters
            else
                i = i + 1; // Move to the next character in the text
        }
    }
}

int main()
{
    string text = "ABABDABACDABABCABAB";    // The text where pattern search is to be performed
    string pattern = "ABABCABAB";            // The pattern to search in the text

    // Call the KMP algorithm function
    KMPSearch(text, pattern);

    return 0;
}
