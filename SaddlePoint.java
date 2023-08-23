import java.util.Scanner;

public class SaddlePoint
{
    int[][] arr;
    SaddlePoint(int n)
    {
        arr = new int[n][n];
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length; j++)
            {
                System.out.print("Enter Data: ");
                arr[i][i] = new Scanner(System.in).nextInt();
            }
        }
    }

    public void find()
    {
        int c = 0, col = 0, l = arr[0][col];
        String pos = "";
        for (int i = 0; i < arr.length; i++)
        {
            int s = arr[i][0];
            for (int j = 0;j < arr.length; j++)
            {
                if (s > arr[i][j])
                {
                    s = arr[i][j];
                    pos = "(" + i + ", ";
                    col = j;
                }
            }

            for (int j = 0; j < arr.length; j++)
            {
                if (l < arr[j][col])
                {
                    l = arr[j][col];
                    c++;
                    pos += j + ")";
                }
            }
        }

        if (c == 0)
        {
            System.out.println("No Saddle Point found...");
        }
        else
        {
            System.out.println("Saddle Point found at " + pos + ".\nElement : " + l);
        }
    }

    public static void main(String args[])
    {
        SaddlePoint obj = new SaddlePoint(3);
        obj.find();
    }
}
