using System;

class EntryPoint
{
    static void Main()
    {
        ConsoleColor[] colors = { ConsoleColor.Red, ConsoleColor.Green, ConsoleColor.DarkYellow, ConsoleColor.DarkBlue };

        for (int i = 0; i < colors.Length; i++)
        {
            Console.ForegroundColor = colors[i];
            Console.WriteLine($"The current index is {i}");
        }

        Console.ResetColor();

        int sum = 1;
        int previous = 1;
        int temp = 0;

        for (int i = 1; i < 10; i++)
        {
            Console.WriteLine(sum);

            temp = sum;
            sum = previous;
            previous = previous + temp;
        }
    }
}