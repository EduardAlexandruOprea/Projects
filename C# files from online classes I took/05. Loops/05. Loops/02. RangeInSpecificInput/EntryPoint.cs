using System;
using System.Threading;

class EntryPoint
{
    static void Main()
    {
        int number = 0;
        int min = 20;
        int max = 30;
        bool numberInRange = false;

        do
        {
            Console.Write($"Please input a number in the range {min} to {max}: ");
            number = Convert.ToInt32(Console.ReadLine());

            if (number >= min && number <= max)
            {
                numberInRange = true;
            }
            else
            {
                Console.WriteLine($"Please input another number in the range {min} to max! Your number {number} is not a valid input!");
                Thread.Sleep(2000); // Pause for 2 seconds
                Console.Clear();
            }
        } while (!numberInRange);

            Console.WriteLine($"Congratulations your number {number} is a valid number!");
    }
}
