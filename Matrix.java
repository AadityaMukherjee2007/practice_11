import java.util.Scanner;
public class Matrix
{
    int m, n;
    int[][] arr;
    Matrix(int a, int b)
    {
        if (a > 25 || b > 25)
        {
            System.out.println("Error!");
            System.exit(0);
        }

        this.m = a;
        this.n = b;
        arr = new int[m][n];
    }

    public void fillArray()
    {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[0].length; j++)
            {
                System.out.print("Enter Number: ");
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public Matrix subtract(Matrix A)
    {
        Matrix R = new Matrix(m, n);
        for (int i = 0; i < A.arr.length; i++)
        {
            for (int j = 0; j < A.arr[0].length; j++)
            {
                R.arr[i][j] = arr[i][j] - A.arr[i][j];
            }
        }
        return R;
    }

    public void print()
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[0].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        System.out.println("Matrix A:");
        Matrix A = new Matrix(3, 3);
        A.fillArray();

        System.out.println("\nMatrix B:");
        Matrix B = new Matrix(3, 3);
        B.fillArray();

        Matrix C = A.subtract(B);
        System.out.println();
        C.print();
    }
}
