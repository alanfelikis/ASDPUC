using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HackerRank
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine(SearchText(2, "hereiamstackerrank"));
            Console.WriteLine(SearchText(2, "hackerworld"));
            Console.WriteLine(SearchText(0, " f "));
            Console.ReadLine();
        }

        public static string SearchText(byte positionText, string text)
        {
            string hackerRank = "hackerrank";
            try
            {
                if (text.Substring(text.Length - positionText, positionText) == hackerRank.Substring(hackerRank.Length - positionText, positionText) && text.Trim().Length > 0 && positionText > 1)
                {
                    return "Yes";
                }
                else
                {
                    return "No";
                }

            }
            catch (Exception)
            {
                return "No";
            }
        }
    }
}
