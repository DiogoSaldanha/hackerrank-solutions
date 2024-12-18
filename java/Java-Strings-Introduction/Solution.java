import java.io.*;
import java.util.*;

public class Solution {
    
    public static String capitalizeFirstLetter(String string){
        if(string.length() <= 0 || string == null){
            return string;
        }
        else{
            return string.substring(0,1).toUpperCase() + string.substring(1);   
        }
    }
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        sc.close();
        
        int lengthSum = A.length() + B.length();
        
        System.out.println(lengthSum);
        
        if (A.compareTo(B) > 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
        System.out.println(capitalizeFirstLetter(A) + " " + capitalizeFirstLetter(B));
    }
}



