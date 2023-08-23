import java.util.Scanner;
public class UniqueNumbers
{
    int m, n;
    UniqueNumbers(int a , int b)
    {
        m = Math.min(a, b);
        n = Math.max(a, b);
    }

    public boolean isUnique(int n)
    {
        boolean[] digitsSeen = new boolean[10];

        while (n != 0)
        {
            int digit = n % 10;
            if (digitsSeen[digit])
            {
                return false;
            }

            digitsSeen[digit] = true;
            n /= 10;
        }

        return true;
    }

    public void print()
    {
        System.out.println("Unique Digits: ");
        for (int i = m; i <= n; i++)
        {
            if (isUnique(i))
            {
                System.out.println(i);
            }
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Lower Limit: ");
        int a = sc.nextInt();
        System.out.print("Enter Upper Limit: ");
        int b = sc.nextInt();

        UniqueNumbers obj = new UniqueNumbers(a, b);
        obj.print();
        sc.close();
    }
}
