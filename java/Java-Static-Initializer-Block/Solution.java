import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

private static int initializeVariablesValues(){
    int temp = scanner.nextInt();
    return temp;
}

private static boolean initializeBooleanVariable(){
    if(B > 0 && H > 0){
        return true;
    }
    else{
        System.out.println("java.lang.Exception: Breadth and height must be positive");
        return false;
    }
}
private static Scanner scanner = new Scanner(System.in);
private static int B = initializeVariablesValues();
private static int H = initializeVariablesValues();
private static boolean flag = initializeBooleanVariable();

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

