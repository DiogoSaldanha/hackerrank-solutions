import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month-1, day);
        if(calendar.getTime().getDay() == 0){
            return "SUNDAY";
        }
        else if(calendar.getTime().getDay() == 1){
            return "MONDAY";
        }
        else if(calendar.getTime().getDay() == 2){
            return "TUESDAY";
        }
        else if(calendar.getTime().getDay() == 3){
            return "WEDNESDAY";
        }
        else if(calendar.getTime().getDay() == 4){
            return "THURSDAY";
        }
        else if(calendar.getTime().getDay() == 5){
            return "FRIDAY";
        }
        else if(calendar.getTime().getDay() == 6){
            return "SATURDAY";
        }
        else{
            return "ERROR";
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
