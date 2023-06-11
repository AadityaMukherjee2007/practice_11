import java.util.Scanner;
public class PrimeCircular
{
    public boolean prime(int n)
    {
        if (n == 2 || n == 3)
        {
            return true;
        }
        for (int i = 2; i < n; i++)
        {
            if (n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    
    public int len(int n)
    {
        int l = 0;
        while (n != 0)
        {
            l++;
            n /= 10;
        }
        return l;
    }
    
    public boolean circularPrime(int n)
    {
        int l = len(n), num = n;
        if (prime(n) != true)
        {
            return false;
        }
        for (int i = 1; i < l; i++)
        {
            int r = n % 10;
            num = (int) (r * Math.pow(10, l) + n) / 10;
            n = num;
            if (prime(num) != true)
            {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        System.out.println("Circular Prime: " + new PrimeCircular().circularPrime(num));
        sc.close();
    }
}