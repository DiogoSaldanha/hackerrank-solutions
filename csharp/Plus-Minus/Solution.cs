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
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<int> arr)
    {
        int arrSize = arr.Count;
        float negativeCounter = 0;
        float positiveCounter = 0;
        float zeroCounter = 0;
        for(int i = 0; i < arrSize; i++)
        {
            if (arr[i] < 0)
            {
                negativeCounter++;
            }
            else if (arr[i] > 0)
            {
                positiveCounter++;
            }
            else
            {
                zeroCounter++;
            }
        }
        zeroCounter /= arrSize;
        positiveCounter /= arrSize;
        negativeCounter /= arrSize;
        Console.WriteLine($"{positiveCounter:f6}\n{negativeCounter:f6}\n{zeroCounter:f6}");
    }

}

class Solution
{
    public static void Main(string[] args)
    {
        int n = Convert.ToInt32(Console.ReadLine().Trim());

        List<int> arr = Console.ReadLine().TrimEnd().Split(' ').ToList().Select(arrTemp => Convert.ToInt32(arrTemp)).ToList();

        Result.plusMinus(arr);
    }
}
