class Parent{
    Parent()
    {
        System.out.println(" Parent");
    }
    void fun( int x)
    {
        System.out.println("In parent function");
    }
}
class child extends Parent
{
    child()
    {
        System.out.println("child");

    }
    void fun()
    {
        System.out.println("In child fun");
    }
}
class Client12
{
    public static void main(String args[])
    {
        Parent obj = new child();
        obj.fun(10);
    }
}