import java.util.Scanner;
public class Denominations
{
    int amt;
    String[] val = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    int[] d = {1000, 500, 100, 50, 20, 10, 5, 1};
    Denominations()
    {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.print("Amount: ");
            amt = sc.nextInt();

            if (amt > 0 && amt < 100000)
            {
                break;
            }
            else if (amt == 0)
            {
                System.exit(0);
            }
            else
            {
                System.out.println("INVALID AMOUNT");
                System.out.println("Max 5 digits can be entered.\n");
                continue;
            }
        }
    }

    public void wordValue()
    {
        String value = "";
        int n = Integer.parseInt(String.valueOf(new StringBuffer(String.valueOf(amt)).reverse()));
        while (n != 0)
        {
            value += val[n % 10] + " ";
            n /= 10;
        }
        System.out.println(value.toUpperCase());
    }
    public void printDenomination()
    {
        System.out.println("\nDENOMINATIONS :");
        int amount = amt, noOfNotes = 0;
        for (int i = 0; i < d.length; i++)
        {
            int r = amt / d[i];

            if (r == 0)
            {
                continue;
            }

            int n = d[i] * r;
            noOfNotes += r;
            System.out.println(d[i] + " x " + r + " = " + n);
            amt -= n;
        }
        System.out.println("\nTOTAL\t\t\t\t\t\t=\t" + amount);
        System.out.println("TOTAL NUMBER OF NOTES\t\t=\t" + noOfNotes);
    }
    public static void main(String args[])
    {
        Denominations obj = new Denominations();
        obj.wordValue();
        obj.printDenomination();
    }
}
