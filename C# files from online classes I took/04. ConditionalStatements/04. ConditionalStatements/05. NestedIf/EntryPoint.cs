using System;

class EntryPoint
{
    static void Main()
    {
        //string username = string.Empty;
        //string password = string.Empty;

        //Console.Write("Input your username: ");
        //username = Console.ReadLine();

        //if (username == "admin")
        //{
        //    Console.Write("Welcome admin, please input your password: ");
        //    password = Console.ReadLine();

        //    if (password == "password")
        //    {
        //        Console.WriteLine("Welcome admin! Full access has been granted to you!");
        //    }
        //    else
        //    {
        //        Console.WriteLine("Sorry, your password is incorrect!");
        //    }
        //}
        //else
        //{
        //    Console.WriteLine("Sorry, your username is incorrect!");
        //}

        // input 150 100 200
        // output 100 150 200

        //int a = 65;
        //int b = 98;
        //int c = 5;

        //string sorted = string.Empty;

        //if ((a < b) && (a < c))
        //{
        //    sorted = a + " ";

        //    if (b < c) // c > b > a
        //    {
        //        sorted = sorted + b + " " + c;
        //    }
        //    else // b > c > a
        //    {
        //        sorted = sorted + c + " " + b;
        //    }
        //}
        //else if ((b < a) && (b < c))
        //{
        //    sorted = b + " ";

        //    if (a < c) // c > a > b
        //    {
        //        sorted = sorted + a + " " + c;
        //    }
        //    else // a > c > b
        //    {
        //        sorted = sorted + c + " " + a;
        //    }
        //}
        //else if ((c < a) && (c < b))
        //{
        //    sorted = sorted + c + " ";

        //    if (a < b) // a > b > c
        //    {
        //        sorted = sorted + a + " " + b;
        //    }
        //    else // b > a > c
        //    {
        //        sorted = sorted + b + " " + a;
        //    }
        //}

        //Console.WriteLine(sorted);

        int asd = int.Parse("-12");
        Console.WriteLine(asd);
        int asdd = int.Parse("9");

        if (asd > asdd)
        {
            Console.WriteLine($"{asd} is bigger than {asdd}");
        }
        else if (asd < asdd)
        {
            Console.WriteLine($"{asdd} is bigger than {asd}");
        }
        else
        {
            Console.WriteLine(3);
        }
    }
}