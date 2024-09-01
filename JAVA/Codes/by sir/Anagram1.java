/*
    Anagram , Pangram 

    Anagram:
        Given 2 strings , check these 2 strings are anagram or not ?
        Two strings are said to be anagram if and only if they both have same set of characters.

        example:
            Sample Input1:
            SECE 
            ECES 
            Sample Output2:
            YES 

            Sample Input2:
            SECE
            CSEE
            Sample Output2:
            YES

 */

 import java.util.Scanner;
 import java.util.Map ;
 import java.util.HashMap;


 public class Anagram1{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        scan.close(); 
        
        Map<Character, Integer>  hm = new HashMap<Character,Integer>(); 

        // character array for string1 and string2 
        char[] s1_array = s1.toCharArray() ; 
        char[] s2_array = s2.toCharArray() ; 


        // fill the hashmap with the characters of string1 and their count 
        for (char c : s1_array){
            if(hm.containsKey(c)){
                hm.put(c,hm.get(c)+1);
            }else{
                hm.put(c,1);
            }
        }

        for(char c : s2_array){
            if(hm.containsKey(c)){
                hm.put(c,hm.get(c)-1);
            }else{
                hm.put(c,-1);
            }
        }

        boolean isAnagram = true;

        for (char c : hm.keySet()){
            if(hm.get(c) != 0){
                isAnagram = false;
                break;
            }
        }

        if(isAnagram){
            System.out.println("YES Anagram");
        }else{
            System.out.println("NO , Not Anagram");
        }



    }
 }
