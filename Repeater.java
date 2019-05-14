import java.util.Scanner;


public class Repeater
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //Taking rows value from the user

        System.out.println("Enter a number");

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(i+" ");
            }
        }

        //Close the resources

        sc.close();
    }
}


