class Demo40
{
    public static void main(String args[])
    {
        int n=6;
        int count = 0;
        for(int i=1 ; i<=n ; i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count!=1)
        {
            System.out.println("Composite");
        }else
        {
            System.out.println("not composite");
        }
    }
} 