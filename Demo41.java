class Demo41
{
    public static void main(String args[])
    {
        int n=25;
        int temp1 = n;

        int count=0;
        int rev=0;
        int sum=0;

        while(temp1!=0)
        {
            int temp2 = temp1 % 10;
            sum= sum*10+temp2;
            count++;
            temp1 = temp1/10;

        }
        int mul = n*n;
        for(int i=1; i<=count;i++)
        {
            int rem = mul%10;
            rev = rev*10+rem;
            mul= mul/10;
        }
        if(sum==rev)
        {
            System.out.println("Automorphics");
        }
        else
        {
            System.out.println("not");
        }

    }
}