/*
Sorting Algorithm: Selection Sort
**********************************

    Selection Sort Algorithm: Step-by-Step Explanation
    ==================================================
    
        Step 1: Initialize the Loop
        ---------------------------
            -> Input:
                - An unsorted array of elements.
            -> Output:
                - A sorted array in ascending order.
            -> Initialize:
                - The outer loop runs from the first element to the second-to-last element of the array.
                - Assume the first element is the minimum and start comparing it with the rest of the elements.

        Step 2: Find the Minimum Element
        ---------------------------------
            -> For each iteration of the outer loop:
                - Initialize the index of the minimum element as the current index.
                - The inner loop starts from the next element and compares all subsequent elements with the current minimum.
                - If a smaller element is found, update the index of the minimum element.

        Step 3: Swap the Elements
        --------------------------
            -> After finding the minimum element in the current unsorted portion of the array:
                - Swap the minimum element found with the first element of the unsorted portion.
                - This places the smallest element in its correct position.
                - Continue with the next element and repeat the process.

        Step 4: Repeat the Process
        --------------------------
            -> Continue the process for all elements in the array until the entire array is sorted.
            -> The sorted portion of the array grows with each iteration of the outer loop, while the unsorted portion shrinks.

    Time Complexity:
    ----------------
        -> Best, Worst, and Average Case: O(n^2) comparisons, where n is the number of elements in the array.
        -> The number of swaps is O(n), which is fewer compared to other simple sorts like Bubble Sort.

    Example Walkthrough:
    ---------------------
        -> Initial Array: [64, 25, 12, 22, 11]
        -> Step-by-Step Sorting:
            1. Find the minimum element (11) and swap with the first element.
            2. Find the minimum element in the remaining array (12) and swap.
            3. Repeat until the array is fully sorted.

    Note:
    -----
        -> Selection Sort is not stable, meaning it may change the relative order of equal elements.
        -> It is an in-place sorting algorithm, requiring only a constant amount of additional memory.

*/

/*
    Problem: Given an unsorted array, sort it using the Selection Sort algorithm.
        Example:
            Input: Array = [64, 25, 12, 22, 11]
            Output: Sorted Array = [11, 12, 22, 25, 64]
*/

#include <iostream>
#include <vector>

using namespace std;

// Function to perform Selection Sort
void selectionSort(vector<int>& arr)
{
    int n = arr.size();

    // Step 1: Outer loop to iterate through each element of the array
    for (int i = 0; i < n - 1; i++)
    {
        // Step 2: Assume the first element in the unsorted portion is the minimum
        int minIndex = i;

        // Step 3: Inner loop to find the minimum element in the remaining unsorted portion
        for (int j = i + 1; j < n; j++)
        {
            // If the current element is smaller than the minimum, update minIndex
            if (arr[j] < arr[minIndex])
                minIndex = j;
        }

        // Step 4: Swap the found minimum element with the first element of the unsorted portion
        if (minIndex != i)
            swap(arr[i], arr[minIndex]);

        // (Optional) Debugging: Print the array after each iteration to see the sorting process
        // cout << "Array after iteration " << i + 1 << ": ";
        // for (int k = 0; k < n; k++)
        //     cout << arr[k] << " ";
        // cout << endl;
    }
}

int main()
{
    // Example array to be sorted
    vector<int> arr = {64, 25, 12, 22, 11};

    // Call the Selection Sort function
    selectionSort(arr);

    // Output the sorted array
    cout << "Sorted Array: ";
    for (int i = 0; i < arr.size(); i++)
        cout << arr[i] << " ";
    cout << endl;

    return 0;
}
