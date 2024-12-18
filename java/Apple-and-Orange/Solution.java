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

class Result {

    /*
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s
     *  2. INTEGER t
     *  3. INTEGER a
     *  4. INTEGER b
     *  5. INTEGER_ARRAY apples
     *  6. INTEGER_ARRAY oranges
     
     arrayMacas apenas considerar >0
     arrayLaranja apenas <0
     
     se valorArray >= s AND valorsArray<= t {incrementa contador}
     */
     
     
    public static List<Integer> getAppleConsideredValues(List<Integer> listApples){
        List<Integer> consideredValues = new ArrayList<Integer>();
        for (int i = 0; i < listApples.size(); i++) {
            if (listApples.get(i) > 0) {
                consideredValues.add(listApples.get(i));
            }
        }
        return consideredValues;
    }
    
    public static List<Integer> getOrangeConsideredValues(List<Integer> listOranges){
        List<Integer> consideredValues = new ArrayList<Integer>();
        for (int i = 0; i < listOranges.size(); i++) {
            if (listOranges.get(i) < 0) {
                consideredValues.add(listOranges.get(i));
            }
        }
        return consideredValues;
    }

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        List<Integer> appleValues = getAppleConsideredValues(apples);
        List<Integer> orangeValues = getOrangeConsideredValues(oranges);
        int appleCounter = 0;
        int orangeCounter = 0;
        
        for (int i = 0; i < appleValues.size(); i++) {
            int isAppleOnSamHouse = appleValues.get(i) + a;
            if (isAppleOnSamHouse >= s && isAppleOnSamHouse <= t){
                appleCounter++;
            }
        }
        
        for (int i = 0; i < orangeValues.size(); i++) {
            int isOrangeOnSamHouse = orangeValues.get(i) + b;
            if (isOrangeOnSamHouse >= s && isOrangeOnSamHouse <= t){
                orangeCounter++;
            }
        }
        
        System.out.println(appleCounter);
        System.out.println(orangeCounter);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int s = Integer.parseInt(firstMultipleInput[0]);

        int t = Integer.parseInt(firstMultipleInput[1]);

        String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int a = Integer.parseInt(secondMultipleInput[0]);

        int b = Integer.parseInt(secondMultipleInput[1]);

        String[] thirdMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(thirdMultipleInput[0]);

        int n = Integer.parseInt(thirdMultipleInput[1]);

        List<Integer> apples = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> oranges = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.countApplesAndOranges(s, t, a, b, apples, oranges);

        bufferedReader.close();
    }
}
