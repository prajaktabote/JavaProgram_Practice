//Null pointer exception
class Demo298
{
    void m1()
    {
        System.out.println("In m1");
    }
    void m2()
    {
        System.out.println("In m2");
    }
    public static void main(String args[])
    {
        System.out.println("Start main");
        Demo298 obj = new Demo298();
        obj.m1();
        obj = null;
        obj.m2();
        System.out.println("End main");
        
    }
}