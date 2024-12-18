import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static int hourglassCalculator(List<List<Integer>> arr, int IRowPosition, int JColPosition) {
        int sum = 0; 
        
        //Calculo da primeira linha:
        sum += arr.get(IRowPosition).get(JColPosition) + arr.get(IRowPosition).get(JColPosition + 1) + arr.get(IRowPosition).get(JColPosition + 2);
        
        //Calculo da linha do meio:
        sum += arr.get(IRowPosition + 1).get(JColPosition + 1);
        
        //Calculo da terceira linha:
        sum += arr.get(IRowPosition + 2).get(JColPosition) + arr.get(IRowPosition + 2).get(JColPosition + 1) + arr.get(IRowPosition + 2).get(JColPosition + 2);
        
        return sum;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
                
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        
        //Chamando a funcao
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int result = hourglassCalculator(arr, i, j);
                if (result > maxSum) {
                    maxSum = result;
                }
            }
        }
        
        System.out.println(maxSum);
    }
}