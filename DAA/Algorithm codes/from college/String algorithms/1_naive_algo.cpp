/*
String Matching Algorithm: Naive Algorithm
*******************************************

    Naive Algorithm: Step-by-Step
    =============================
    
        Step 1: Initialize
        --------------------
            -> Input: Text T of length n, Pattern P of length m
            -> Initialize an empty list or array to store indices of matches (if needed)

        Step 2: Iterate Over Text
        --------------------------
            -> For each index i from 0 to (n - m):
                a. Assume a match is found (set a flag `match_found = true`)

                // Iterate over each character in the pattern
                b. For each index j from 0 to m-1:
                    i. Compare T[i + j] with P[j]
                    ii. If T[i + j] is not equal to P[j], set `match_found = false` and break out of the loop

        Step 3: Check for Match
        ------------------------
            -> If `match_found` is still true after the inner loop, it means the pattern P is found at index i in the text T.
                a. Record the index i (e.g., print or store in the list)

        Step 4: Repeat Until End of Text
        --------------------------------
            -> Continue the outer loop until all possible substrings of T are checked

        Step 5: Output Results
        -----------------------
            -> If matches were found, output the starting indices.
            -> If no matches were found, indicate that the pattern was not found.

    Time Complexity:
    ----------------
        -> Worst case: O(n * m)
        (Here, `n` is the length of the text, and `m` is the length of the pattern.)

    Example Walkthrough:
    ---------------------
        -> Text: "GEEKS FOR GEEKS"
        -> Pattern: "GEEK"
        -> Slide the pattern across the text and compare character by character.
        -> Output the starting index of matches.
*/

// Naive String Matching Algorithm Implementation
#include <iostream>
#include <string>

using namespace std;

void naiveStringMatch(string text, string pattern) {
    int n = text.length();     // Length of the text
    int m = pattern.length();  // Length of the pattern

    // Step 2: Iterate Over Text
    for (int i = 0; i <= n - m; i++) {
        bool match_found = true; // Assume a match is found

        // Step 2b: Check each character in the pattern
        for (int j = 0; j < m; j++) {
            if (text[i + j] != pattern[j]) {
                match_found = false; // Mismatch found
                break;
            }
        }

        // Step 3: If match is found, record the index
        if (match_found) {
            cout << "Pattern found at index " << i << endl;
        }
    }
}

int main() {
    string text = "GEEKS FOR GEEKS";    // The text where pattern search is to be performed
    string pattern = "GEEK";            // The pattern to search in the text

    // Call the Naive String Matching algorithm function
    naiveStringMatch(text, pattern);

    return 0;
}
