/*
    Assignment Problem (Brute Force Approach)
    ------------------------------------------
    
    Problem Statement:
    -------------------
        Given `n` jobs and `n` persons, where the cost of assigning Person `i` 
        to Job `j` is given in a `cost` matrix, find the minimum cost to 
        assign all jobs to persons such that each job is assigned to exactly 
        one person and each person is assigned to exactly one job.

    Approach:
    =========
        Step 1: Initialize the Problem
            - Read the number of jobs and persons, `n`.
            - Read the `n x n` cost matrix where `cost[i][j]` is the cost of 
              assigning Person `i` to Job `j`.

        Step 2: Generate All Permutations of Job Assignments
            - Create a vector `job_assignment` with values `[0, 1, 2, ..., n-1]`
              representing job assignments.
            - Generate all permutations of the `job_assignment` vector.

        Step 3: Calculate Costs and Find Minimum
            - Initialize `min_cost` to a large value (e.g., `INT_MAX`).
            - For each permutation of `job_assignment`:
                - Compute the total cost of the current permutation.
                - If the computed cost is less than `min_cost`:
                    - Update `min_cost` with the new lower cost.
                    - Record the current permutation as the optimal assignment.

        Step 4: Output the Results
            - Print the `min_cost` of the optimal assignment.
            - Print the job assignments corresponding to the `min_cost`.

    Time Complexity:
    -----------------
        - Average Case: O(n!) due to the generation of all permutations of `n` jobs.

    Example Walkthrough:
    ---------------------
        Input:
            Enter the number of jobs and persons: 3 3
            Enter the cost matrix:
            10 19 8
            10 18 7
            13 16 9

        Output:
            Minimum cost to assign all jobs to persons: 26
            Job assignment:
            Person 1 -> Job 1
            Person 2 -> Job 3
            Person 3 -> Job 2
*/

#include <iostream>
#include <vector>
#include <algorithm>
#include <climits>  // For INT_MAX

using namespace std;

int main() {
    // Step 1: Initialize the Problem
    int job_count, person_count;
    cout << "Enter the number of jobs and persons: ";
    cin >> job_count >> person_count;

    // Check if the number of jobs and persons are the same
    if (job_count != person_count) {
        cout << "Number of jobs and persons must be the same!" << endl;
        return 1;
    }

    int cost[job_count][person_count];

    cout << "Enter the cost matrix:" << endl;
    for (int i = 0; i < job_count; i++) {
        for (int j = 0; j < person_count; j++) {
            cin >> cost[i][j];
        }
    }

    // Step 2: Generate All Permutations of Job Assignments
    vector<int> job_assignment(job_count);
    for (int i = 0; i < job_count; i++) {
        job_assignment[i] = i;
    }

    int min_cost = INT_MAX;
    vector<int> min_cost_assignment(job_count);

    // Generate all permutations of the job assignments
    do {
        int sum = 0;

        // Step 3: Calculate the total cost for the current permutation
        for (int i = 0; i < job_count; i++) {
            sum += cost[i][job_assignment[i]];
        }

        // Update the minimum cost and assignment if a lower cost is found
        if (min_cost > sum) {
            min_cost = sum;
            min_cost_assignment = job_assignment;
        }

    } while (next_permutation(job_assignment.begin(), job_assignment.end()));

    // Step 4: Output the Results
    cout << "Minimum cost to assign all jobs to persons: " << min_cost << endl;
    cout << "Job assignment:" << endl;
    for (int i = 0; i < job_count; i++) {
        cout << "Person " << i + 1 << " -> Job " << min_cost_assignment[i] + 1 << endl;
    }

    return 0;
}
