//Multiple Inheritance in interface
interface Demo1
{
    void fun();
}
interface Demo2
{
    void fun();
}
class  DemoChild implements Demo1,Demo2
{
    public void fun()
    {
        System.out.println("In fun child");
    }
}
class Client28
{
    public static void main(String args[])
    {
        Demo1 obj1 = new DemoChild();
        Demo2 obj2 = new DemoChild();
        obj1.fun();
        obj2.fun();
    }
}