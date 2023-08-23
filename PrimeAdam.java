import java.util.Scanner;
public class PrimeAdam
{
    public int reverse(int n)
    {
        int rev = 0;
        while (n != 0)
        {
            int r = n % 10;
            rev = rev * 10 + r;
            n /= 10;
        }
        return rev;
    }

    public boolean prime(int n)
    {
        if (n == 1)
            return false;
        if (n == 2 || n == 3)
            return true;

        for (int i = 2; i < n; i++)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public boolean check(int n)
    {
        int sq = n * n, revSq = reverse(n) * reverse(n);
        if (prime(n) && sq == reverse(revSq))
            return true;

        return false;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        System.out.println("Prime Adam Number: " + new PrimeAdam().check(n));
    }
}
