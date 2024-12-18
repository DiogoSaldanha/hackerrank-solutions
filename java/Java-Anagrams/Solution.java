import java.util.Scanner;

public class Solution {
    
    static boolean isAnagram(String a, String b) {
        int checkStringA = 1;
        int checkStringB = 1;
        String aLowerCase = a.toLowerCase();
        String bLowerCase = b.toLowerCase();
        
        if (a.length() != b.length()) {
            return false;
        } 
        else{
            for (int i = 0; i < a.length(); i++) {
                checkStringA *= aLowerCase.charAt(i);
                checkStringB *= bLowerCase.charAt(i);
            }    
            
            if (checkStringA == checkStringB) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}