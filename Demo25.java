class Demo25
{
    public static void main(String args[])
    {
        int n=1234522;
        int i=0;
        int add=0;
        int mult=1;

        while(n!=0)
        {
            i=n%10;
            if(i%2==0)
            {
                add=add+i;
             

         }else(i%2==1)
         {
            mult=mult*1;

         }  
         n=n/10;
         i++;
System.out.println("add" +i);
System.out.println("mult" +i);
                    
    }
  }
}