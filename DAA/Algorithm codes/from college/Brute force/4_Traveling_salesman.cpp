/*
Traveling Salesman Problem (Brute Force Approach)
**************************************************

    Problem Statement:
    ------------------
        Given a set of cities and the distance between every pair of cities, 
        find the shortest possible route that visits every city exactly once 
        and returns to the starting point.

    Approach:
    =========
        Step 1: Generate all possible permutations of cities.
        ------------------------------------------------------
            - Create a vector to hold the order of cities.
            - Initialize the vector with the sequence from 0 to (n-1), 
              where n is the number of cities.

        Step 2: Calculate the cost for each permutation.
        --------------------------------------------------
            - For each permutation, calculate the total travel cost.
            - The cost is the sum of distances between consecutive cities in 
              the permutation, plus the distance from the last city back to 
              the starting city.

        Step 3: Find the minimum cost permutation.
        -------------------------------------------
            - Track the minimum cost encountered.
            - Update the minimum cost and corresponding path if a lower cost 
              permutation is found.

    Time Complexity:
    -----------------
        - Average Case: O(n!) due to the generation of all permutations of 
          n cities.
        - Factorial time complexity is due to the permutations of cities.

    Example Walkthrough:
    ---------------------
        Input:
            Enter the number of cities: 4
            Enter the distance matrix:
            0 10 15 20
            10 0 35 25
            15 35 0 30
            20 25 30 0

        Output:
            Minimum cost to visit all cities: 80
            Path:
            City 1 -> City 2 -> City 4 -> City 3 -> City 1
*/

// C++ program to solve Traveling Salesman Problem using brute force approach

#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    // Step 1: Getting input from the user

    int city_count;
    cout << "Enter the number of cities: ";
    cin >> city_count;

    // Initialize the distance matrix
    vector<vector<int>> distance(city_count, vector<int>(city_count));

    cout << "Enter the distance matrix:" << endl;
    for (int i = 0; i < city_count; i++) {
        for (int j = 0; j < city_count; j++) {
            cin >> distance[i][j];
        }
    }

    // Step 2: Finding the minimum cost to visit all cities

    vector<int> city_order(city_count);
    for (int i = 0; i < city_count; i++) {
        city_order[i] = i;
    }

    int min_cost = INT_MAX;
    vector<int> min_cost_order(city_count);

    do {
        int current_cost = 0;

        // Calculate the cost of the current permutation
        for (int i = 0; i < city_count - 1; i++) {
            current_cost += distance[city_order[i]][city_order[i + 1]];
        }
        // Add the cost to return to the starting city
        current_cost += distance[city_order[city_count - 1]][city_order[0]];

        // Update minimum cost and path if current cost is lower
        if (current_cost < min_cost) {
            min_cost = current_cost;
            min_cost_order = city_order;
        }

    } while (next_permutation(city_order.begin(), city_order.end()));

    // Step 3: Output the results
    cout << "Minimum cost to visit all cities: " << min_cost << endl;
    cout << "Path: ";
    for (int i = 0; i < city_count; i++) {
        cout << "City " << min_cost_order[i] + 1;
        if (i != city_count - 1) {
            cout << " -> ";
        }
    }
    cout << " -> City " << min_cost_order[0] + 1 << endl; // Returning to the starting city

    return 0;
}
