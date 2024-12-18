import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int x = 1;
            int temp = a + x * b;
            for(int j = 0; j < n; j++){
                System.out.print(String.format("%d ", temp));
                x *= 2;
                temp = temp + x * b;
            }
            System.out.print("\n");
        }
        in.close();
    }
}
