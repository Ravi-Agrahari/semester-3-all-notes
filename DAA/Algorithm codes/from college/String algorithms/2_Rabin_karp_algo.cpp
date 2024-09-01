/*
String Matching Algorithm: Rabin-Karp Algorithm
***********************************************

    Rabin-Karp Algorithm: Step-by-Step
    ======================================
    
        Step 1:- Calculate Hash Value:
        ----------------------------------
            -> Calculate the hash value of the pattern and the hash value of the first window of the text.
            -> The hash function can be a simple rolling hash function that sums up ASCII values or a more complex polynomial rolling hash.

        Step 2:- Slide the Window Over the Text:
        ----------------------------------------
            -> Start from the beginning of the text and slide the window (of the same length as the pattern) over the text one character at a time.
            -> For each new window:
                a. If the hash values of the current window and the pattern match, check the characters to confirm the match.
                b. If the pattern matches the current window, record the starting index.
                c. Recalculate the hash value for the next window by removing the leftmost character and adding the next character in the sequence.

        Step 3:- Repeat Until End of Text:
        ------------------------------------
            -> Continue sliding the window and checking for matches until the end of the text is reached.

    Time Complexity:
    -----------------
        -> Average case: O(n + m)
        -> Worst case: O(n * m) in case of hash collisions.
        (Here, `n` is the length of the text, and `m` is the length of the pattern.)

    Example Walkthrough:
    ---------------------
        -> Text: "GEEKS FOR GEEKS"
        -> Pattern: "GEEK"
        -> Calculate hash for the pattern and the first window.
        -> Slide the window, updating the hash and checking for matches.
        -> Output the starting index of matches.

*/

/*
    Problem: Given a text and a pattern, find all occurrences of the pattern in the text using the Rabin-Karp algorithm.
        Example:
            Input: Text = "GEEKS FOR GEEKS", Pattern = "GEEK"
            Output: Pattern found at index 0
                    Pattern found at index 10
*/

#include <iostream>
#include <string>

using namespace std;

const int d = 256;   // Number of characters in the input alphabet (assuming ASCII)
const int q = 101;   // A prime number for modulus in hash function

// Function to search for pattern using Rabin-Karp algorithm
void rabinKarp(string text, string pattern)
{
    int n = text.length();
    int m = pattern.length();
    int p = 0; // Hash value for pattern
    int t = 0; // Hash value for text (current window)
    int h = 1; // The value of h would be "pow(d, m-1) % q"

    // Step 1: Precompute h = pow(d, m-1) % q
    for (int i = 0; i < m - 1; i++)
        h = (h * d) % q;

    // Step 2: Calculate the hash value of the pattern and the first window of the text
    for (int i = 0; i < m; i++)
    {
        p = (d * p + pattern[i]) % q;
        t = (d * t + text[i]) % q;
    }

    // Step 3: Slide the pattern over text one character at a time
    for (int i = 0; i <= n - m; i++)
    {
        // Step 3a: Check if hash values of current window of text and pattern are equal
        if (p == t)
        {
            bool match = true;
            // Step 3b: Check the characters one by one if hashes match
            for (int j = 0; j < m; j++)
            {
                if (text[i + j] != pattern[j])
                {
                    match = false;
                    break;
                }
            }

            // If the pattern matches the current window, print the index
            if (match)
                cout << "Pattern found at index " << i << endl;
        }

        // Step 3c: Calculate the hash value for the next window
        if (i < n - m)
        {
            t = (d * (t - text[i] * h) + text[i + m]) % q;

            // We might get a negative value of t, converting it to positive
            if (t < 0)
                t = (t + q);
        }
    }
}

int main()
{
    string text = "GEEKS FOR GEEKS";    // The text where pattern search is to be performed
    string pattern = "GEEK";            // The pattern to search in the text

    // Call the Rabin-Karp algorithm function
    rabinKarp(text, pattern);

    return 0;
}
