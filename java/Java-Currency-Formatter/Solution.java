import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        NumberFormat numberFormat = NumberFormat.getInstance();
        String us = (numberFormat.getCurrencyInstance(Locale.US).format(payment));
        String india = (numberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment));
        String china = (numberFormat.getCurrencyInstance(Locale.CHINA).format(payment));
        String france = (numberFormat.getCurrencyInstance(Locale.FRANCE).format(payment));
        
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
