//print whether n is prime or not
class Demo95
{
    public static void main(String args[])
    {
        int n=5;
        int count=0;
        for(int i=1; i<=n; i++)
        {
            if(n%i==0)
            {
                count++;
            }
            
        }
        if(count==2)
            {
                System.out.println("prime no" );
            }
            else
            {
                System.out.println("not prime number");
            }
    }
}