import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class FileHandling
{
    //to check whether the file is empty or not.
    public boolean check() throws IOException
    {
        FileReader reader = new FileReader("data.txt");
        BufferedReader read = new BufferedReader(reader);
        String text;
        if ((text = read.readLine()) != null)
        {
            return true;
        }
        return false;
    }

    public void writeData(String[] arr) throws IOException
    {
        FileWriter file = new FileWriter("data.txt", true);
        BufferedWriter writer = new BufferedWriter(file);
        writer.write("\n");
        for (int i = 0; i < arr.length; i++)
        {
            writer.write(arr[i] + " ");
        }

        writer.close();
        file.close();
    }
    public static void main(String[] args) throws IOException
    {
        FileHandling obj = new FileHandling();
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String[] usrData = new String[2];

        for (int i = 0; i < 1; i++)
        {
            System.out.print("Enter name: ");
            usrData[0] = sc.readLine();
            System.out.print("Enter age: ");
            usrData[1] = String.valueOf(Integer.parseInt(sc.readLine()));
            obj.writeData(usrData);
        }

        FileReader reader = new FileReader("data.txt");
        BufferedReader read = new BufferedReader(reader);

        String text;
        while ((text = read.readLine()) != null)
        {
            System.out.println(text);
        }
        reader.close();
        read.close();
    }
}
