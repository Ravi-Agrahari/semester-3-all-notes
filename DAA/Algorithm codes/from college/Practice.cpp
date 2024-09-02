// Problem Statement:
//     ------------------
//         Given a set of cities and the cost of traveling every pair of cities, 
//         find the shortest possible route that visits every city exactly once 
//         and returns to the starting point.




#include<iostream>
#include<vector>
#include<algorithm>
#include<climits>


using namespace std ;

int main(void){
    
    int city_count ; 
    cout << "Enter the number of cities: " ;
    cin >> city_count ;

    vector<vector<int>> cost(city_count, vector<int>(city_count)) ;
    cout << "Enter the cost matrix: " << endl ;
    for(int i = 0 ; i<city_count ; i++){
        for(int j = 0 ; j < city_count ; j++){
            cin >> cost[i][j] ; 
        }
    }

    



    

return 0;
}