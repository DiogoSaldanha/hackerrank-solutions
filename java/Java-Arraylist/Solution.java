import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        List<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < n; i++) {
            int d = scanner.nextInt();
            ArrayList<Integer> numbersList = new ArrayList<Integer>();
            list.add(numbersList);
            for (int j = 0; j < d; j++) {
                list.get(i).add(scanner.nextInt());
            }
        }
        
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            int line = scanner.nextInt();
            int position = scanner.nextInt();
            
            try{
                System.out.println(list.get(line - 1).get(position - 1));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
        
        
        scanner.close();
    }
}