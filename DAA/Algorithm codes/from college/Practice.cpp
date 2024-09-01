// Problem Statement:
//     ------------------
//         Given a set of cities and the distance between every pair of cities, 
//         find the shortest possible route that visits every city exactly once 
//         and returns to the starting point.




#include<iostream>
#include<vector>
#include<algorithm>
#include<climits>


using namespace std ;

int main(void){
    
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

    // to store the permutation of cities
    vector<int> city_order(city_count);
    for(int i = 0; i < city_count; i++){
        city_order[i] = i;
    }


    // finding the minimum distance to visit all cities
    int min_distance = INT_MAX;
    vector<int> min_distance_order(city_count);

    do {
        int current_distance = 0;

        // Calculate the cost of the current permutation
        for (int i = 0; i < city_count - 1; i++) {
            current_distance += distance[city_order[i]][city_order[i + 1]];
        }

        if(current_distance < min_distance){
            min_distance = current_distance;
            min_distance_order = city_order;
        }


    }while(next_permutation(city_order.begin(), city_order.end()));

    // Output the results

    cout << "Minimum cost to visit all cities: " << min_distance << endl;
    cout << "Path: ";
    for (int i = 0; i < city_count; i++) {
        cout << "City " << min_distance_order[i] + 1;
        if (i != city_count - 1) {
            cout << " -> ";
        }
    }
    cout << " -> City " << min_distance_order[0] + 1 << endl; // Returning to the starting city

    

return 0;
}