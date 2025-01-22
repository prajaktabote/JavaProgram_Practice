class Evenodd4
{
    public static void main(String args[])
    {
        int sum = 0;
        int mul =1;
        for(int i=0;i<=10; i++)
        {
            if(i%2==0)
            {
                sum= sum+i;
            }
            else{
                mul= mul*i;
            }
        }
        System.out.println(sum);
        System.out.println(mul);
       
    }
}