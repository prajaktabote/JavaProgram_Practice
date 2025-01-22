//write a program to find square of even digits of given no.
class Demo23
{
    public static void main(String args[])
    {
        int n =94211143;
        int i=0;
        while( n!=0)
        {
            i=n%10;
            if(i%2==0)
            {
                System.out.println(i*i);


            }
            n=n/10;
        }
    }
}

