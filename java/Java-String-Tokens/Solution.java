import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        s = s.trim();
        if (s.isEmpty()) {
            System.out.println("0");
            return;
        }
        
        String[] splittedString = s.split("[^A-Za-z0-9]+");
        System.out.println(splittedString.length);
        for (String string : splittedString) {
            System.out.println(string);
        }
        
        scan.close();
    }
}

