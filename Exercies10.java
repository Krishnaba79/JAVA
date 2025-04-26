
    import java.util.Scanner;
    class Exercise10 {

        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("enter the number");
            int n = input.nextInt();
            int i;
            System.out.println ("The first 10 natural numbers are:\n");
            for (i=1;i<=n;i++)
            {
                System.out.println (i);
            }
            System.out.println ("\n");
        }
    }

