//Exception handling java program
import java.util.Scanner;
class Division
{
    public static void main(String args[])
    {
        int a,b,result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input two integer");
        a=sc.nextInt();
        b=sc.nextInt();

        //try block
        try{
            result=a/b;
            System.out.println("Result=" +result);
        }
        //catch block
        catch(ArithmeticException e)
        {
            System.out.println("Exception caught: Division by zero");
        }
    }
}