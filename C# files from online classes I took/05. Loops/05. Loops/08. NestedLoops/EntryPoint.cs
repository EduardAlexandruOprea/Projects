using System;

class EntryPoint
{
    static void Main()
    {
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                Console.Write($"index[{i}][{j}] ");
            }

            Console.WriteLine();
        }
    }
}