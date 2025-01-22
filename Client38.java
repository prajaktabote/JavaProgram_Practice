class Outer
{
     void m1()
    {
        System.out.println("In m1-outer");
        class Inner
        {
            void m1()
            {
                System.out.println("In m1-inner");
            }
        }
        return new Inner();
    }
}
class Client38
{
    public static void main(String args[])
    {
        Outer obj = new Outer();
        obj.m1();
        obj.m1();
    }
}