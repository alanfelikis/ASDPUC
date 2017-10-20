using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Pangramas
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine(wordPangramas("We promptly judged antique ivory buckles for the next prize"));
            Console.WriteLine(wordPangramas("We promptly judged antique ivory buckles for the prize"));
            Console.ReadLine();

        }
        public static string wordPangramas(string text)
        {
            try
            {
                char alphaStart = Char.Parse("A");
                char alphaEnd = Char.Parse("Z");
                for (char i = alphaStart; i <= alphaEnd; i++)
                {
                    if (text.ToUpper().IndexOf(i.ToString()) < 0)
                    {
                        return "not pangram";
                    }
                }
                return "pangram";
            }
            catch (Exception)
            {
                return "not pangram";
            }
        }
    }
}
