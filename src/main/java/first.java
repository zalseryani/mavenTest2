
import java.util.Scanner;
public class first
{
    public static void main (String [] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the first and second Number for multiplication and addition operations : ");
        int firstNum = s.nextInt();
        int secondNum = s.nextInt();

        int multiResult = multiplication ( firstNum , secondNum);
        System.out.println("The multiplication result is: "+multiResult);
        int additionResult = addition( firstNum , secondNum);

        System.out.println("The addition result is : "+additionResult);
    }


    static int multiplication(int x, int y)
    {
        return x*y;
    }

    static int addition(int x, int y)
    {
        return x+y;
    }



}
