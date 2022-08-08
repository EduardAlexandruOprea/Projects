using System;

class EntryPoint
{
    static void Main()
    { 
        // Write an expression that checks if given integer is odd or even 
        // and output the result on the console.
        int firstNumber = Convert.ToInt32(Console.ReadLine());
        int secondNumber = Convert.ToInt32(Console.ReadLine());


        if (firstNumber % 2 == 0)
        {
            Console.WriteLine($"The number {firstNumber} is even!");
        }
        else
        {
            Console.WriteLine($"The number {firstNumber} is odd!");
        }

        string result = firstNumber % 2 == 0 ? $"The number {firstNumber} is even" : $"The number {firstNumber} is odd!";

        Console.WriteLine((firstNumber % 2 == 0) ? $"The number {firstNumber} is even" : $"The number {firstNumber} is odd!");

        // Write a boolean expression that checks if an integer can be divided 
        // by 2, 3 and 4 (all three numbers at the same time) without remainder (use logical operators).

        if ((firstNumber % 2 == 0) && (firstNumber % 3 == 0) && (firstNumber % 4 == 0))
        {
            Console.WriteLine($"The number {firstNumber} is divisible by 2, 3 and 4 without a remainder!");
        }
        else
        {
            Console.WriteLine($"There is a remainder!");
        }

        // Write an expression to check if the 3rd digit of an integer is 3. 
        // e.g. 5352 -> true, 534754 -> 

        if (firstNumber.ToString().Length >= 3)
        {
            if (firstNumber.ToString()[firstNumber.ToString().Length - 3] == '3')
            {
                Console.WriteLine($"The 3rd digit, right to left, of the number {firstNumber} is 3!");
            }
            else
            {
                Console.WriteLine($"The 3rd digit, right to left, of the number {firstNumber} is not 3!");
            }
        }
        else
        {
            Console.WriteLine("Sorry, the number has less than 3 digits!");
        }
        

        // Write an if statement that exchanges the values of 
        // 2 numbers if the first is bigger than the second

        int tempNumber = 0;

        if (firstNumber > secondNumber)
        {
            tempNumber = secondNumber;
            secondNumber = firstNumber;
            firstNumber = tempNumber;
        }

        Console.WriteLine(firstNumber);
        Console.WriteLine(secondNumber);
    }
}