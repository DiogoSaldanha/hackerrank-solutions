import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        BigInteger bigNumber1 = scanner.nextBigInteger();
        BigInteger bigNumber2 = scanner.nextBigInteger();
        
        System.out.println(bigNumber1.add(bigNumber2));
        System.out.println(bigNumber1.multiply(bigNumber2));
        scanner.close();
    }
}
