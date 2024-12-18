import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        List<Integer> l = new ArrayList<Integer>();
        
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            l.add(scanner.nextInt());
        }
        
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            String query = scanner.next();
            
            if (query.equals("Insert")) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                l.add(x, y);
            }
            if (query.equals("Delete")) {
                int x = scanner.nextInt();
                l.remove(x);
            }
        }
        
        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i) + " ");
        }
        
        scanner.close();
    }
}