import java.util.Scanner;
class factorial3
{
    public static void main(String args[])
    {
        int n ,c, fact=1;
        System.out.println("Enter an integer to calculate its factorial");
        Scanner sc=new Scanner(System.in);

        n=sc.nextInt();

        if(n<0)
        {
            System.out.println("Number should be non-negative");
            
        }else{
            for(i=1;i<=n;i++)
            fact = fact*c;
            System.out.println("Factorial of " +n+" is ="fact);
        }
    }
}