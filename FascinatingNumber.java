import java.util.Scanner;
public class FascinatingNumber
{
    int c = 0;
    int[] arr = new int[9];

    public boolean check(int n)
    {
        int a = n * 2, b = n * 3;
        fill(n);
        fill(a);
        fill(b);

        sort();

        for (int i = 0; i < arr.length; i++)
        {
            if ((i + 1) != arr[i])
            {
                return false;
            }
        }
        return true;
    }

    public void fill(int n)
    {
        while (n != 0)
        {
            arr[c] = n % 10;
            n /= 10;
            c++;
        }
    }

    public void sort()
    {
        for (int i = 0 ; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                }
            }
        }
    }

    public static void main(String args[])
    {
        FascinatingNumber obj = new FascinatingNumber();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        System.out.println("Fascinating Number: " + obj.check(num));
        sc.close();
    }
}
