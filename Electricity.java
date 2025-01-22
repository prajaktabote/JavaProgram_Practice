//given an input A which represent units of electricity consumed at your house.
//calculate and print bill amount
//units<=100; price per unit is 1
//units>100; price per unit is 2
//input is 50;       output is 50;
//input is 200   outout is 300


class electricity
{
    public static void main(String args[])
    {
        int x=95;
        if(x<=100)
        {
            System.out.println(x*1);

        }else
        {
            System.out.println(100*1+(x-100)*2);

            
        }
    }
}