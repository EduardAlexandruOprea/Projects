using System;

class EntryPoint
{
    static void Main()
    {
        string tempUsername = Console.ReadLine();
        string tempPassword = Console.ReadLine();

        string username = string.Empty;
        string password = string.Empty;

        if (tempUsername.Length >= 6)
        {
            username = tempUsername;
        }
        else
        {
            username = "defaul_user";
        }

        if (tempPassword.Length >= 8)
        {
            password = tempPassword;
        }
        else
        {
            password = "12345678";
        }

        Console.WriteLine(tempUsername);
        Console.WriteLine(username);
        Console.WriteLine(tempPassword);
        Console.WriteLine(password);
    }
}