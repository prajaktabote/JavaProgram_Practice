//Default Exception Handler
//1>Arithmetics Exception

class Demo300
{
    void m1()
    {
        System.out.println(10/0);
        m2();
    }
    void m2()
    {
        System.out.println("In m2");
    }
    public static void main(String args[])
    {
        Demo300 obj = new Demo300();
        
        obj.m1();
        System.out.println("End main");
        
    }                                                                             
    
}