/*

 to solve the 0/1 knapsack problem using brute force approach in C++.

Problem Statement:
-------------------

Given a set of items, each with a weight and a value, determine the number of each item to include in a knapsack so that the total weight is less than or equal to a given limit and the total value is maximized.

Test Case:
\---------

Input:
    Number of items: 3
    Enter the weights of the items: 10 20 30
    Enter the price of the items: 60 100 120
    Enter the maximum weight limit: 50

Output:
    Maximum price that can be obtained: 220
    Items included in the knapsack:
    Item 1
    Item 2

*/

#include <iostream>
#include <vector>

using namespace std;

int main() {

    int n;
    cout << "Number of items: ";
    cin >> n;

    vector<int> weights(n);
    cout << "Enter the weights of the items: ";
    for(int i = 0; i < n; i++) {
        cin >> weights[i];
    }

    vector<int> prices(n);
    cout << "Enter the price of the items: ";
    for(int i = 0 ; i < n ; i++){
        cin >> prices[i];
    }

    int max_weight;
    cout << "Enter the maximum weight limit: ";
    cin >> max_weight;

    int max_price = 0;
    vector<int> max_price_items;

    
    


    


}