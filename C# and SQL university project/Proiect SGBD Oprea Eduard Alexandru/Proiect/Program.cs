using System;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Proiect
{
    
    public static class Global
    {
        public static string stringConectare = @"Data Source = WIN-8RD5KB28P26\SQLEXPRESS01; Initial Catalog = Magazin; Integrated Security = SSPI";
        public static SqlConnection con;
        public static SqlDataAdapter daLumanari;
        public static DataSet ds;
        public static SqlCommandBuilder cb;
        public static int ok = 1;
    }

    internal static class Program
    {
        /// <summary>
        /// The main entry point for the application.
        /// </summary>
        [STAThread]
        static void Main()
        {  
            Application.EnableVisualStyles();
            Application.SetCompatibleTextRenderingDefault(false);
            Application.Run(new Meniu());
        }
    }
}
