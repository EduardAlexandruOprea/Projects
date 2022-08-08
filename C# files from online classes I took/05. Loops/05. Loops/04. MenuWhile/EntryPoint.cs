using System;

class EntryPoint
{
    static void Main()
    {
        int chosenFruit = 0;
        int choice = 0;
        bool newChoice = false;
        string[] fruits = new string[10];
        fruits[0] = "Orange";
        fruits[1] = "Lemon";

        while (!newChoice)
        {
            Console.Write("1. Add New Item" +
                "\n2. Edit Item" +
                "\n3. Remove Item" +
                "\n4. View All items" +
                "\n5. Exit" +
                "\nYour choice: ");

            choice = Convert.ToInt32(Console.ReadLine());

            switch (choice)
            {
                // Adding new Items
                case 1:
                    AddItem(fruits);
                    break;

                // Editing an Item
                case 2:
                    ListALlItems(fruits);
                    chosenFruit = EditItem(fruits);
                    break;

                // Removing an Item
                case 3:
                    ListALlItems(fruits);
                    chosenFruit = RemoveItem(fruits);
                    break;

                // View all current items
                case 4:
                    ListALlItems(fruits);
                    break;

                // Exit
                case 5:
                    newChoice = true;
                    break;
                default:
                    Console.WriteLine("Unrecognized option, please choose from 1 to 5!");
                    break;
            }
        }
    }

    private static void ListALlItems(string[] fruits)
    {
        Console.WriteLine("\nCurrent Fruits: ");
        for (int i = 0; i < fruits.Length; i++)
        {
            if (fruits[i] != null)
            {
                Console.WriteLine($" {i + 1} {fruits[i]}");
            }
        }
        Console.WriteLine();
    }

    private static int RemoveItem(string[] fruits)
    {
        int chosenFruit;
        Console.Write("\nWhich fruit do you want to remove (1 to 10): ");
        chosenFruit = Convert.ToInt32(Console.ReadLine());
        Console.WriteLine($"{fruits[chosenFruit - 1]} was removed!");
        fruits[chosenFruit - 1] = null;

        string[] tempArray = new string[fruits.Length];
        int tempArrayIndex = 0;

        for (int i = 0; i < fruits.Length; i++)
        {
            if (fruits[i] != null)
            {
                tempArray[tempArrayIndex] = fruits[i];
                tempArrayIndex++;
            }
        }

        Array.Copy(tempArray, fruits, tempArray.Length);

        Console.WriteLine();
        return chosenFruit;
    }

    private static int EditItem(string[] fruits)
    {
        int chosenFruit;
        Console.Write("\nWhich fruit do you want to change (1 to 10): ");
        chosenFruit = Convert.ToInt32(Console.ReadLine());

        Console.Write("Please input a new fruit that will substitute ");
        Console.ForegroundColor = ConsoleColor.Red;
        Console.Write($"{fruits[chosenFruit - 1]}");
        Console.ResetColor();
        Console.Write(": ");

        fruits[chosenFruit - 1] = Console.ReadLine();
        Console.WriteLine();
        return chosenFruit;
    }

    private static void AddItem(string[] fruits)
    {
        for (int i = 0; i < fruits.Length; i++)
        {
            if (fruits[i] == null)
            {
                Console.WriteLine("Please add a new fruit: ");
                fruits[i] = Console.ReadLine();
                break;
            }
        }
    }
}