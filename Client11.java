class Parent
{
Parent()
    {
        System.out.println("Parent constructor");
    }
    void fun()
    {
        System.out.println("In parent fun");
    }
}
class child extends Parent
{
    child()
    {
       System.out.println("child Constructor");
    }
    void fun(int x)
    {
        System.out.println("In child fun");
    }
  
}
class Client11{
    public static void main(String args[])
    {
        Parent obj = new child();
        obj.fun();
    }
}