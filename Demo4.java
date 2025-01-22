//Break and Continue
//write program for the print given number is prime or not
class Demo4{
    public static void main(String args[])
    {
        int n=1;
        boolean flag=false;

        for(int i=2; i<=n/2; ++i)
        {
            if (n%i==0)
            {
                flag= true;
                break;
            }
                
        }
        if(!flag)
        System.out.println(n + "is a prime number");
        else
        System.out.println(n + "is not prime number");
    }
}
