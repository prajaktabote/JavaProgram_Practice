//how to get using input using Scanner program in java
import java.util.Scanner;
class GetInput{
    public static void main(String args[])
    {
        int a;
        float b;
        String s;
        
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        s=sc.nextLine();
        System.out.println("you entered the string" +s);

        System.out.println("Enter an integer");
        a=sc.nextInt();
        System.out.println("You enter a integer" +a);

        System.out.println("Enter a float");
        b=sc.nextFloat();
        System.out.println("You enter a float");

    }
}