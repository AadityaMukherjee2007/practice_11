import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ArrayUtils
{
    int[] arr;
    ArrayUtils(int n)
    {
        arr = new int[n];
    }

    public void input() throws IOException
    {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < arr.length; i++)
        {
            System.out.print("Enter Number: ");
            arr[i] = Integer.parseInt(sc.readLine());
        }

        print();
        sc.close();
    }

    public void delete(int n)
    {
        int[] temp = new int[arr.length - 1];
        int pos = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if (arr[i] == n)
            {
                pos = i;
                break;
            }
        }

        for (int i = pos; i < arr.length - 1; i++)
        {
            arr[i] = arr[i] + arr[i + 1];
            arr[i + 1] = arr[i] - arr[i + 1];
            arr[i] = arr[i] - arr[i + 1];
        }

        System.arraycopy(arr, 0, temp, 0, temp.length);

        arr = temp;
        updateStatement();
    }

    public void insert(int index, int n)
    {
        index = index - 1;
        int[] temp = new int[arr.length + 1];
        temp[index] = n;

        for (int i = 0, j = 0; i < temp.length; i++)
        {
            if (i != index)
            {
                temp[i] = arr[j];
                j++;
            }
        }

        arr = temp;
        updateStatement();
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

    public void updateStatement()
    {
        System.out.println("\nArray Updated Successfully!");
        System.out.print("Updated Array: ");
        print();
    }
    public static void main(String[] args) throws IOException
    {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Array Length: ");
        int len = Integer.parseInt(sc.readLine());
        ArrayUtils obj = new ArrayUtils(len);

        obj.input();
        obj.insert(2, 2);
        obj.delete(6);
    }
}
