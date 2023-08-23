import java.util.Scanner;
public class SpecialNumber
{
    int n;
    public void read()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        this.n = sc.nextInt();
        sc.close();
    }

    public int factorial(int x)
    {
        int fac = 1;
        for (int i = 1; i <= x; i++)
        {
            fac *= i;
        }
        return fac;
    }

    public boolean isSpecial()
    {
        int sum = 0, copy = n;
        while (copy != 0)
        {
            int r = copy % 10;
            sum += factorial(r);
            copy /= 10;
        }

        if (sum == n)
        {
            return true;
        }
        return false;
    }

    public void display()
    {
        System.out.println("Special Number: " + isSpecial());
    }

    public static void main(String args[])
    {
        SpecialNumber obj = new SpecialNumber();
        obj.read();
        obj.display();
    }
}
