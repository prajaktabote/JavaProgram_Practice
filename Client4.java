class Parent{
    int x=10;
    static int y=20;
    static
    {
        System.out.println("In parent constructor");
    }
    void methodOne()
    {
        System.out.println(x);
        System.out.println(y);
    }
    static void methodTwo()
    {
        System.out.println(y);
    }
}
class child extends Parent
{
    static{
        System.out.println("In child static block");
    }
    child()
    {
        System.out.println("In child constructor");
    }
}
class Client4
{
    public static void main(String args[])
    {
        child obj=new child();
        obj.methodOne();
        obj.methodTwo();
    }
}