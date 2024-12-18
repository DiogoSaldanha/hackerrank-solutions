import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
        
        for (int i = testCases; i > 0; i--) {
            String pattern = in.nextLine();
            try {
                Pattern regexValidation = Pattern.compile(pattern);
                System.out.println("Valid");
                
            } catch (Exception e) {
                System.out.println("Invalid");
            }
            testCases--;
        }
	}
}