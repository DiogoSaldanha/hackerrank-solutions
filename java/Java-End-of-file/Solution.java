import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;

        while(scanner.hasNext()){
            String n = scanner.nextLine();
            System.out.println(String.format("%d %s", counter, n));
            counter++;
        }
        scanner.close();
    }
}
