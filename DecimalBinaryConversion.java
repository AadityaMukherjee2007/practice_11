public class DecimalBinaryConversion
{
    public long toDecimal(String n)
    {
        int pow = n.length() - 1;
        long dec = 0;
        for (int i = 0; i < n.length(); i++, pow--)
        {
            if (n.charAt(i) == '1')
            {
                dec += (long) Math.pow(2, pow) * 1;
            }
        }
        return dec;
    }

    public String toBinary(int n)
    {
        StringBuffer bin = new StringBuffer();
        while (n != 0)
        {
            if (n % 2 == 0)
            {
                bin.append(0);
            }
            else
            {
                bin.append(1);
            }
            n /= 2;
        }

        return bin.reverse().toString();
    }

    public static void main(String args[])
    {
        DecimalBinaryConversion obj = new DecimalBinaryConversion();
        System.out.println(obj.toDecimal("101"));
        System.out.println(obj.toBinary(5));
    }
}
