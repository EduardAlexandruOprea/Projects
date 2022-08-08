using System;

class EntryPoint
{
    static void Main()
    {
        Random rng = new Random();

        string warriorName = "Bob";
        string mageName = "Carl";
        int warriorDamage = 0;
        int mageDamage = 0;
        int warriorHealth = 100;
        int mageHealth = 100;
        bool gameOver = false;

        while (!gameOver)
        {
            warriorDamage = rng.Next(1, 10);
            mageDamage = rng.Next(1, 10);

            mageHealth -= warriorDamage;
            warriorHealth -= mageDamage;

            Console.ForegroundColor = ConsoleColor.Blue;
            Console.WriteLine($"{warriorName} inflicted {warriorDamage} damage upon {mageName}. {mageName} has {mageHealth} health remaining!");
            Console.ForegroundColor = ConsoleColor.Magenta;
            Console.WriteLine($"{mageName} inflicted {mageDamage} damage upon {warriorName}. {warriorName} has {warriorHealth} health remaining!");

            if (warriorHealth <= 0)
            {
                Console.ForegroundColor = ConsoleColor.Green;
                Console.WriteLine($"The Mage {mageName} is victorious with {mageHealth} health left!");
                Console.ForegroundColor = ConsoleColor.Red;
                Console.WriteLine($"The Warrior {warriorName} lost!");
                gameOver = true;
            }
            else if (mageHealth <= 0)
            {
                Console.ForegroundColor = ConsoleColor.Green;
                Console.WriteLine($"The Warrior {warriorName} is victorious with {warriorHealth} health left!");
                Console.ForegroundColor = ConsoleColor.Red;
                Console.WriteLine($"The Mage {mageName} lost!");
                gameOver = true;
            }
        }

        Console.ResetColor();
    }
}
