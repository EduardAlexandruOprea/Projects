using System;

class EntryPoint
{
    static void Main()
    {
        string[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
        string[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
        int daysInAMonth = 31;
        int dayOfWeek = 0;

        for (int currentMonth = 0; currentMonth < months.Length; currentMonth++)
        {
            Console.WriteLine($"Month: {months[currentMonth]}");

            for (int currentDay = 1; currentDay <= daysInAMonth; currentDay++)
            {
                Console.WriteLine($"  {currentDay} {days[dayOfWeek]}");

                dayOfWeek++;

                if (dayOfWeek == 7)
                {
                    dayOfWeek = 0;
                }

                if ((currentMonth == 1 && currentDay == 28) || 
                    ((currentMonth == 3 || currentMonth == 5 || currentMonth == 8 || currentMonth == 10) && currentDay == 30))
                {
                    break;
                }
            }
        }
    }
}