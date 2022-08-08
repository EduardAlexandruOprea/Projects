using System;

class EntryPoint
{
    static void Main()
    {
        // Write an expression that checks if a given point (x,y) 
        // is within a circle with radius 4 and centre at (0,0) sqrt(x^2 + y^2)
        // Math.Sqrt
        double x = 4;
        double y = 4;
        double radius = 4;
        double distance = Math.Sqrt(Math.Pow(x, 2) + Math.Pow(y, 2));

        if (distance == radius)
        {
            Console.WriteLine($"The distance to the point is {distance}, and it is exactly on the border of the circle!");
        }
        else if (distance < radius)
        {
            Console.WriteLine($"The distance to the point is {distance}, and it is inside the circle!");
        }
        else if (distance > radius)
        {
            Console.WriteLine($"The distance to the point is {distance}, and it is outside the circle!");
        }

        // input in meters
        // ask the user what conversion to do microm, mm, cm, dm, km
        // output the meters into the desired converted unit
        // input 2m
        // convert to mm
        // output 2000mm

        Console.Write("Please input the length in meters: ");
        int meters = Convert.ToInt32(Console.ReadLine());
        Console.Write("Pick a conversion unit - um, mm, cm, dm, km: ");
        string convertTo = Console.ReadLine();
        double newDistance = 0;

        if (convertTo == "um")
        {
            newDistance = meters * 100000;
            Console.WriteLine($"The converted distance from {meters} meters into um is {newDistance} um.");
        }
        else if (meters > 100)
        {
            newDistance = meters * 1000;
            Console.WriteLine($"The converted distance from {meters} meters into mm is {newDistance} mm.");
        }
        else if (convertTo == "cm")
        {
            newDistance = meters * 100;
            Console.WriteLine($"The converted distance from {meters} meters into cm is {newDistance} cm.");
        }
        else if (convertTo == "dm")
        {
            newDistance = meters * 10;
            Console.WriteLine($"The converted distance from {meters} meters into dm is {newDistance} dm.");
        }
        else if (convertTo == "km")
        {
            newDistance = (double)meters / 1000;
            Console.WriteLine($"The converted distance from {meters} meters into km is {newDistance} km.");
        }
        else
        {
            Console.WriteLine("Sorry, one of your inputs was incorrect!");
        }


    }
}