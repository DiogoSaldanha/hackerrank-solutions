import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {       
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int negativeCounter = 0;
        for (int i = 0; i < n; i++) {
            // Temp fora do for para reiniciar a soma toda vez.
            int temp = 0;
            for (int j = i; j < n ; j++) {
                temp += arr[j];
                if (temp < 0) {
                    negativeCounter++;
                }
            }
        }
        
        System.out.println(negativeCounter);
        scanner.close();
    }
}