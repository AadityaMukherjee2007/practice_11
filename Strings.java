public class Strings
{
    String str;
    Strings(String string)
    {
        str = string;
    }

    public void reverse()
    {
        StringBuilder rev = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--)
        {
            rev.append(str.charAt(i));
        }
        str = rev.toString();
    }

    public void longestWord()
    {
        str = str.trim() + " ";
        int wl = 0;
        String lword = "", word = "";
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) != ' ')
            {
                word += str.charAt(i);
            }
            else
            {
                if (wl < word.length())
                {
                    lword = word;
                    wl = lword.length();
                }
                word = "";
            }
        }
        System.out.println(lword);
    }

    public void print()
    {
        System.out.println(str);
    }
    public static void main(String args[])
    {
        Strings obj = new Strings("Computer Applications");
        obj.print();
        //obj.reverse();
        //obj.print();
        obj.longestWord();
    }
}
