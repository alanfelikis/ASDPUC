using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;

namespace CamelCase
{
    static class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine(countWords("saveChangesInTheEditor"));
            Console.WriteLine(countWords("save"));
            Console.ReadLine();
        }

        public static string countWords(string text)
        {
            try
            {
                string pattern = @"(?<=\w)(?=[A-Z])";
                string result = Regex.Replace(text.Trim(), pattern, " ", RegexOptions.None);
                if (text.Trim().Length > 0)
                {
                    return result.Split(' ').Count().ToString();
                }
                else
                {
                    return "0";

                }
            }
            catch (Exception)
            {
                return "0";
            }
           
        }
       
    }
}
