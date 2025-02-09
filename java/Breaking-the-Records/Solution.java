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
    
    public static List<Integer> breakingRecords(List<Integer> scores) {
        List<Integer> records = new ArrayList<>();
        long worstScore = scores.get(0);
        long bestScore = scores.get(0);
        int worstCounter = 0;
        int bestCounter = 0;
        
        
        for (int i = 1; i < scores.size(); i++) {
            if (scores.get(i) < worstScore) {
                worstCounter++;
                worstScore = scores.get(i);
            }
            if (scores.get(i) > bestScore) {
                bestCounter++;
                bestScore = scores.get(i);
            }
        }
        
        records.add(bestCounter);
        records.add(worstCounter);
        return records;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.breakingRecords(scores);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
