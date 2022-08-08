using System;

class EntryPoint
{
    static void Main()
    {
        int[] intArray = { 2, 3, 5, 7, 8, 5, 3, 6, 7, 8 };

        for (int i = 0; i < intArray.Length; i++)
        {
            if (i % 2 == 0)
            {
                Console.WriteLine($"Current Index {i}, current element is {intArray[i]}");
            }
        }
    }
}