import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        try{
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int division = num1/num2;
            System.out.println(division);
        } catch(InputMismatchException exception){
            System.out.println("java.util.InputMismatchException");
        } catch(ArithmeticException ae){
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
    }
}
