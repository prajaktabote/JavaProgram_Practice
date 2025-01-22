//count all its factor and print count
class Demo94
{
    public static void main(String args[])
    {
        int n=6;
        int count=0;

        for(int i=1; i<=n; i++)
        {
            if(n%i==0)
            count++;

        }
        System.out.println(n);

    }
}