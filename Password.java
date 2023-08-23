import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Password
{
	int n, a, b;
	char[] alphabet = new char[26];

	Password(int length, int start1, int start2)
	{
		n = length;
		a = start1;
		b = start2;

		int x = 0;
		for (char i = 'a'; i <= 'z'; i++)
		{
			alphabet[x] = i;
			x++;
		}
	}

	public String password()
	{
		String password = "";
		for (int i = 1; i <= n; i++)
		{
			int c = a % 26;
			if (c > 0 && c < 26)
			{
				password += alphabet[c];
			}
			else
			{
				n++;
			}
			int temp = b;
			b += a;
			a = temp;
		}

		return password;
	}

	public static void main(String args[])
	{
		long start = System.currentTimeMillis();
		long beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		int l = 0, x = 0, y = 0;
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			l = Integer.parseInt(sc.readLine());

			if (l > Math.pow(10, 5))
			{
				System.out.println("Error!");
				System.exit(0);
			}

			x = Integer.parseInt(sc.readLine());
			y = Integer.parseInt(sc.readLine());
		}
		catch (IOException E)
		{
			System.out.println("Error!");
		}

		Password obj = new Password(l, x, y);
		System.out.println(obj.password());
		long afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		long actualMemUsed=afterUsedMem-beforeUsedMem;
		System.out.println("Memory used: " + actualMemUsed);
		long end = System.currentTimeMillis();
        System.out.println("Runtime: " + (end - start) + "ms");
	}
}