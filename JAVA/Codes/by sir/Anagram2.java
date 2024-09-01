import java.util.Scanner;
import java.util.Map ;
import java.util.HashMap;



public class Anagram2 {
    public static void main(String[] args){
            
            Scanner scan = new Scanner(System.in);
            String s1 = scan.nextLine();
            String s2 = scan.nextLine();
            scan.close(); 
            
            Map<Character, Integer>  hm = new HashMap<Character,Integer>(); 
    
            // character array for string1 and string2 
            char[] s1_array = s1.toCharArray() ; 
            char[] s2_array = s2.toCharArray() ;

            
    }
}
