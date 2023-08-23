public class PowerRecursion
{
    public int pow(int n, int p)
    {
        if (p == 1)
        {
            return n;
        }
        return n * pow(n, p - 1);
    }
    
    public static void main(String args[])
    {
        PowerRecursion obj = new PowerRecursion();
        System.out.println(obj.pow(2, 7));
    }
}