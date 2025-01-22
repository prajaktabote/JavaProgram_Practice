class fibonaciSeries2
{
    public static void main(String args[])
    {
        int i=0;
        int j=1;
        int sum=0;

        for(int x=0; x<=10; x++)
        {
            System.out.println(sum);
            i=j;
            j=sum;
            sum=i+j;
        }

    }
}