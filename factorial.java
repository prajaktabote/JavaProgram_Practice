//write a program to write a factorial form
class factorial
{
    public static void main(String args[])
    {
        int n=5;
        int fact=1;
        while(n!=0)
        {
            fact =n*fact;
            n--;
        }
        System.out.println("fact" + fact);

    }
}