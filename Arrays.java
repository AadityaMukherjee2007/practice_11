import java.util.Scanner;
public class Arrays
{
    int[] arr;
    Arrays(int n)
    {
        arr = new int[n];
    }

    public void input()
    {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print("Enter Data: ");
            arr[i] = sc.nextInt();
        }
    }

    public void fill()
    {
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = (int) (Math.random() * 10);
        }
    }

    public void avg()
    {
        double sum = 0, odd = 0, even = 0, sum_odd = 0, sum_even = 0;
        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
            if (i % 2 == 0)
            {
                sum_even += arr[i];
                even++;
            }
            else
            {
                sum_odd += arr[i];
                odd++;
            }
        }
        double avg = sum / arr.length;
        double even_avg = sum_even / even;
        double odd_avg = sum_odd / odd;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
        System.out.println("Average (even): " + even_avg);
        System.out.println("Average: (odd):" + odd_avg);
    }

    public void print()
    {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++)
        {
            if (i != arr.length - 1)
            {
                System.out.print(arr[i] + ", ");
            }
            else
            {
                System.out.print(arr[i]);
            }
        }
        System.out.println("]");
    }

    public static void main(String args[])
    {
        Arrays obj = new Arrays(20);
        obj.fill();
        obj.print();
        obj.avg();
    }
}
