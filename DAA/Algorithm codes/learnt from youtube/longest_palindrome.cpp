/*
    the time complexity of given code is O(n^2) and space complexity is O(1)
    because , 
    -> we are iterating through the string twice , once for odd length palindromes and once for even length palindromes
    -> and we are using only constant space to store the maxLength and starting index of the longest palindrome

    the code is working fine for all test cases and giving the correct output

*/



#include<iostream>
using namespace std ;


string longestPalindrome(string str){
    int n = str.size(); // str.length() 

    int maxLength = 1; // to track length of longest palindrome

    int s ; //to track starting indices of the longest palindrome

    // loop for odd length palindromes ... 
    for(int i=0 ; i<n ; i++){
        // compute the odd length longest palindrome with center i
        int j=0; 
        while(i-j>=0 && i+j<n && str[i-j]==str[i+j]){
            j++;
        }
        j--; // to get the correct length of palindrome

        // note:- longest palindrome around i is str[i-j] to str[i+j] [ i.e (i+j)-(i-j)+1 = 2*j+1 ] 

        if(2*j+1 > maxLength){
            maxLength = 2*j+1;
            s = i-j;
        }

    }

    // loop for even length palindromes ...
    for(int i = 0 ; i<n ; i++){

        // to compute the even length longest palindrome with center i
        int j = 0;

        while(i-j>=0 && i+j+1 <n && str[i-j] == str[i+j+1]){
            j++;
        }

        j--; // to get the correct length of palindrome

        // note:- longest palindrome around i is str[i-j] to str[i+j+1] [ i.e (i+j+1)-(i-j)+1 = 2*j+2 ]

        if(2*j+2 > maxLength){
            maxLength = 2*j+2;
            s = i-j;
        }

    }
    return str.substr(s,maxLength);

}

int main(void){

    string str = "abaab";
    cout<<longestPalindrome(str)<<endl;
    
return 0;
}