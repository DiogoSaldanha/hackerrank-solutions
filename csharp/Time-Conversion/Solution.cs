using System.CodeDom.Compiler;
using System.Collections.Generic;
using System.Collections;
using System.ComponentModel;
using System.Diagnostics.CodeAnalysis;
using System.Globalization;
using System.IO;
using System.Linq;
using System.Reflection;
using System.Runtime.Serialization;
using System.Text.RegularExpressions;
using System.Text;
using System;

class Result
{

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static string timeConversion(string s)
    {
        string[] splittedString;
        string result = "";
        foreach (char letter in s)
        {
            if (letter == 'A')
            {
                splittedString = s.Split("AM");
                result = String.Join("", splittedString);
                string substring = result.Substring(0, 2);
                int.TryParse(substring, out int substringInt);
                if (substringInt < 10)
                {
                    string substringFinal = substringInt.ToString();
                    substringFinal = substringFinal.Insert(0, "0");
                    result = result.Replace(substring, substringFinal);
                }
                else if (substringInt == 12)
                {
                    substringInt -= 12;
                    string substringFinal = substringInt.ToString();
                    substringFinal = substringFinal.Insert(0, "0");
                    result = result.Replace(substring, substringFinal);
                }
                Console.WriteLine("Teste do AM: " + result);
            }
            else if (letter == 'P')
            {
                splittedString = s.Split("PM");
                result = String.Join("", splittedString);
                string substring = result.Substring(0, 2);
                int.TryParse(substring, out int substringInt);
                if (substringInt < 12)
                {
                    substringInt += 12;
                }
                string substringFinal = substringInt.ToString();
                result = result.Replace(substring, substringFinal);
                Console.WriteLine("Teste do PM: " + result);
            }
        }
        return result;
        
    }
    
}

class Solution
{
    public static void Main(string[] args)
    {
        TextWriter textWriter = new StreamWriter(@System.Environment.GetEnvironmentVariable("OUTPUT_PATH"), true);

        string s = Console.ReadLine();

        string result = Result.timeConversion(s);

        textWriter.WriteLine(result);

        textWriter.Flush();
        textWriter.Close();
    }
}
