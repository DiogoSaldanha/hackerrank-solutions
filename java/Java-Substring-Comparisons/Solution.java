import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        int i = 0;
        smallest = s.substring(i, k);
        do{
            if (smallest.compareTo(s.substring(i, k)) >= 0){
                smallest = s.substring(i, k);
            }
            if (largest.compareTo(s.substring(i, k)) < 0){
                largest = s.substring(i, k);
            }
            k++;
            i++;
        } while (k != s.length() + 1);
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}