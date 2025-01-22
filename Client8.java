class Parent 
{
    Parent()
    {
        System.out.println("Parent constructor");
    }
    void property()
    {
        System.out.println("Home, Gold ");

    }
    void marry()
    {
        System.out.println("Prabhas");
    }
}
class child extends Parent{
    child()
    {
        System.out.println("child constructor ");
    }
    void marry()
    {
        System.out.println("Aryan");
    }
}
class Client8
{
    public static void main(String args[])
    {
        child obj = new child();
        obj.property();
        obj.marry();
    }
}