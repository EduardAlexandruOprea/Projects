using System;

class EntryPoint
{
    static void Main()
    {
        //int firstNumber = 6;
        //int secondNumber = 6;

        //if (firstNumber > secondNumber)
        //{
        //    Console.WriteLine($"The number {firstNumber} is bigger than the number {secondNumber}");
        //}
        //else if (firstNumber < secondNumber)
        //{
        //    Console.WriteLine($"The number {firstNumber} is NOT bigger than the number {secondNumber}");
        //}
        //else
        //{
        //    Console.WriteLine($"The number {firstNumber} is equal to the number {secondNumber}");
        //}

        string nameOfPlayer = "Player";
        int killedEnemies = 77;
        int score = 0;
        int bonusScore = 0;
        int totalScore = 0;

        if (killedEnemies == 100)
        {
            score = 100;
            bonusScore = (int)(score * 0.2);
            totalScore = score + bonusScore;
            Console.ForegroundColor = ConsoleColor.Green;
            Console.WriteLine($"Congratulations player {nameOfPlayer}! You killed all enemies! You receive {score} points, with {bonusScore} bonus points for a total of {totalScore} points!");
            Console.ResetColor();
        }
        else if (killedEnemies >= 75 && killedEnemies <= 99)
        {
            score = killedEnemies;
            bonusScore = (int)(score * 0.05);
            totalScore = score + bonusScore;
            Console.ForegroundColor = ConsoleColor.Yellow;
            Console.WriteLine($"Congratulations player {nameOfPlayer}! You killed almost all enemies! You receive {score} points, with {bonusScore} bonus points for a total of {totalScore} points!");
            Console.ResetColor();
        }
        else if (killedEnemies >= 50 && killedEnemies <= 74)
        {
            score = killedEnemies;
            Console.ForegroundColor = ConsoleColor.DarkYellow;
            Console.WriteLine($"Congratulations player {nameOfPlayer}! You killed almost all enemies! You receive {score} points!");
            Console.ResetColor();
        }
        else if (killedEnemies >= 0 && killedEnemies <= 49)
        {
            Console.ForegroundColor = ConsoleColor.Red;
            Console.WriteLine($"Sorry player {nameOfPlayer}! You lost the game!");
            Console.ResetColor();
        }
        else
        {
            Console.WriteLine("Invalid amount of enemies killed");
        }
    }
}