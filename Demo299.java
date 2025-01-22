class Demo299
{
    void m2()
    {
        System.out.println("In m2");
        try{
             System.out.println(10/0);
        }catch(ArithmeticException ae){
            System.out.println("Exception");
    }           
        System.out.println("End m2");
    }
    void m1()
    {
        System.out.println("In m1");
        m2();
        System.out.println("End m1");
    }
    public static void main(String args[])
    {
        Demo299 obj = new Demo299();
        obj.m1();
        System.out.println("End main");

    }
}