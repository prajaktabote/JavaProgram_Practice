interface Demo1{
    default void fun()
    {
        System.out.println("In-fun Demo");
    }
}
interface Demo2
{
    default void fun()
    {
        System.out.println("In fun demo2");
    }
}
class DemoChild implements Demo1,Demo2
{
    public void fun()
    {
        System.out.println("In fun DemoChild");
    }
}
class Client32 
{
    public static void main(String args[])
    {
        DemoChild obj = new DemoChild();
        obj.fun();
    }
}