class Parent
{
    Parent()
    {
        System.out.println("Parent constructor");
    }
    void fun()
    {
        System.out.println("In fun");
    }
}
class child extends Parent{
    child()
    {
        System.out.println("child constructor");
        
    }
    void gun()
    {
        System.out.println("In gun");
    }
}
class Client9 
{
    public static void main(String args[])
    {
        child obj1 = new child();
        obj1.fun();
        obj1.gun();

      


      

    }
}