class Demo2
{
    public static void main(String args[])
    {
        int n=21;
        boolean flag=false;

        for(int i=2; i<=n/2; i++)
        {
            if(i%n==0)
            {
                flag=true;
                break;
            }
        }
            if(!flag)
            System.out.println(n+ " is a prime number");
            else
            System.out.println(n+ "is not a prime number");
        }
    }
