/*
String Matching Algorithm: Boyer-Moore Algorithm
**************************************************

    Boyer-Moore Algorithm: Step-by-Step Explanation
    =================================================

        Step 1: Preprocessing
        -----------------------
            -> Build the Bad Character Table:
                - For each character in the pattern, store the last occurrence index of that character.
                - If a character is not present in the pattern, it is assigned a value indicating it is absent (usually -1).

            -> Build the Good Suffix Table:
                - For each suffix of the pattern, store the distance to the next occurrence of that suffix.
                - This helps in skipping unnecessary comparisons when a mismatch occurs.

        Step 2: Searching
        -------------------
            -> Align the pattern with the beginning of the text.
            -> Compare the pattern with the text from right to left.
            -> If a mismatch occurs, use the bad character and good suffix tables to determine the next position to align the pattern.

        Step 3: Shift the Pattern
        ---------------------------
            -> Move the pattern to the right according to the precomputed tables.
            -> Repeat the comparison until the entire text has been searched or the pattern is found.

    Time Complexity:
    ----------------
        -> Average case: O(n / m) where n is the length of the text and m is the length of the pattern.
        -> Worst case: O(n * m) in case of very frequent mismatches.

    Example Walkthrough:
    ---------------------
        -> Text: "ABAAABCD"
        -> Pattern: "ABC"
        -> Build Bad Character Table:
            - 'A': 4, 'B': 2, 'C': 1
        -> Build Good Suffix Table:
            - (Specific values depend on the pattern)
        -> Perform the search using the tables to skip unnecessary comparisons.

    Note:
    -----
        -> Boyer-Moore is considered one of the most efficient string matching algorithms due to its use of preprocessing to skip comparisons.
        -> It is particularly effective for large texts and patterns.

*/

/*
    Problem: Given a text and a pattern, find all occurrences of the pattern in the text using the Boyer-Moore algorithm.
        Example:
            Input: Text = "ABAAABCD", Pattern = "ABC"
            Output: Pattern found at index 4
*/

#include <iostream>
#include <vector>
#include <string>
#include <unordered_map>

using namespace std;

// Function to build the Bad Character Table
unordered_map<char, int> buildBadCharTable(const string& pattern)
{
    unordered_map<char, int> badCharTable;
    int m = pattern.length();

    // Fill the table with the last occurrence of each character
    for (int i = 0; i < m; i++)
    {
        badCharTable[pattern[i]] = i;
    }

    return badCharTable;
}

// Function to build the Good Suffix Table
vector<int> buildGoodSuffixTable(const string& pattern)
{
    int m = pattern.length();
    vector<int> goodSuffixTable(m, m);
    vector<int> f(m + 1, -1);

    int j = m - 1;
    for (int i = m - 1; i >= 0; i--)
    {
        if (i > j || f[i + 1] != -1)
            f[i] = max(f[i + 1], j - i + 1);
        while (j >= 0 && pattern[j] != pattern[i])
            j = f[j];
        f[i] = j--;
    }

    for (int i = 0; i < m; i++)
    {
        goodSuffixTable[i] = m;
        if (i + 1 < m)
            goodSuffixTable[m - f[i + 1] - 1] = i + 1;
    }

    return goodSuffixTable;
}

// Function to perform Boyer-Moore string matching
void boyerMoore(const string& text, const string& pattern)
{
    int n = text.length();
    int m = pattern.length();

    // Step 1: Build Bad Character and Good Suffix Tables
    unordered_map<char, int> badCharTable = buildBadCharTable(pattern);
    vector<int> goodSuffixTable = buildGoodSuffixTable(pattern);

    int s = 0; // Shift of the pattern with respect to the text
    while (s <= n - m)
    {
        int j = m - 1;

        // Step 2: Compare pattern with text from right to left
        while (j >= 0 && pattern[j] == text[s + j])
            j--;

        // If a match is found
        if (j < 0)
        {
            cout << "Pattern found at index " << s << endl;

            // Use good suffix rule to determine the next shift
            s += goodSuffixTable[0];
        }
        else
        {
            // Use bad character rule to determine the next shift
            char badChar = text[s + j];
            s += max(goodSuffixTable[j], j - badCharTable[badChar]);
        }
    }
}

int main()
{
    string text = "ABAAABCD";   // The text where pattern search is to be performed
    string pattern = "ABC";     // The pattern to search in the text

    // Call the Boyer-Moore algorithm function
    boyerMoore(text, pattern);

    return 0;
}
