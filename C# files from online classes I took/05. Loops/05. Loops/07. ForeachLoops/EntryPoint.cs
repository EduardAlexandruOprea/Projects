using System;

class EntryPoint
{
    static void Main()
    {
        int[] array = { 1, 2, 3, 4, 5, 6, 7 };

        for (int i = 0; i < array.Length; i++)
        {
            if (i % 2 == 0)
            {
                Console.WriteLine(array[i]);

            }
        }

        foreach (var item in array)
        {
            Console.WriteLine(item);
        }
    }
}