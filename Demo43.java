class Demo43
{
    public static void main(String args[])
    {
        int a=0;
        int b=1;
        int sum=0;

        for(int i=0; i<=10; i++)
        {
            System.out.println(i);
            sum=sum+i;
            System.out.println(sum);

            for(int i=0; i<=100; i++)
            {
                int sum= sum + ++sum;
                System.out.println(i);
            }

        }
    }
}