using System;

class EntryPoint
{
    static void Main()
    {
        Console.Write("1. Add New Item" +
            "\n2. Edit Item" +
            "\n3. Remove Item" +
            "\n4. Exit" +
            "\nYour choice is: ");

        int number = Convert.ToInt32(Console.ReadLine());

        switch (number)
        {
            case 1:
                Console.WriteLine($"A new item has been added to the list of items.");
                break;
            case 2:
                Console.WriteLine($"An item has been edited.");
                break;
            case 3:
                Console.WriteLine($"An item has been removed");
                break;
            case 4:
                Environment.Exit(0);
                break;
            default:
                Console.WriteLine($"Unrecognized option!");
                break;
        }

    }
}