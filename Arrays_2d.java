import java.util.Scanner;
public class Arrays_2d
{
    int[][] arr;
    Arrays_2d()
    {
        arr = new int[3][4];
    }

    public void in()
    {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println("Row" + (i + 1) + ":");
            for (int j = 0; j < arr[0].length; j++)
            {
                System.out.print("Enter Element: ");
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public void sum()
    {
        for (int i = 0; i < arr.length; i++)
        {
            int sum = 0;
            for (int j = 0; j < arr[0].length; j++)
            {
                sum += arr[i][j];
            }
            System.out.println("Sum of row" + (i + 1) + " : " + sum);
        }

        for (int i = 0; i < arr[0].length; i++)
        {
            int sum = 0;
            for (int j = 0; j < arr.length; j++)
            {
                sum += arr[j][i];
            }
            System.out.println("Sum of column" + (i + 1) + " : " + sum);
        }
    }

    public void print()
    {
        System.out.print("{");
        for (int i = 0; i < arr.length; i++)
        {
            if (i != arr.length - 1)
            {
                System.out.print("{");
                for (int j = 0; j < arr[0].length; j++)
                {
                    if (j != arr[0].length - 1)
                    {
                        System.out.print(arr[i][j] + ", ");
                    }
                    else
                    {
                        System.out.print(arr[i][j]);
                    }
                }
                System.out.print("}, ");
            }
            else
            {
                System.out.print("{");
                for (int j = 0; j < arr[0].length; j++)
                {
                    if (j != arr[0].length - 1)
                    {
                        System.out.print(arr[i][j] + ", ");
                    }
                    else
                    {
                        System.out.print(arr[i][j]);
                    }
                }
                System.out.print("}");
            }
        }
        System.out.println("}");
    }

    public void matrixPrint()
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[0].length; j++)
            {
                if (arr[i][j] >= 0 && arr[i][j] < 10)
                {
                    System.out.print("  " + arr[i][j]);
                }
                else
                {
                    System.out.print(" " + arr[i][j]);
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        Arrays_2d obj = new Arrays_2d();
        obj.in();
        obj.matrixPrint();
        obj.sum();
    }
}
