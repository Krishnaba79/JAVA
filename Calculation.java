class Calculation10
    {
        int z;

        public void addition(int x, int y)
        {
            z = x + y;
            System.out.println("The sum of the given numbers:"+z);
        }
        public void Subtraction(int x, int y)
        {
            z = x - y;
            System.out.println("The difference between the given numbers:"+z);
        }
    }

public class Calculation extends Calculation10
{
    public void multiplication(int x, int y)
    {
        z = x * y;
        System.out.println("The product of the given numbers:"+z);
    }

    public static void main(String args[])
    {
        int a = 20, b = 10;
        Calculation demo = new Calculation();
        demo.addition(a, b);
        demo.Subtraction(a, b);
        demo.multiplication(a, b);
    }
}
