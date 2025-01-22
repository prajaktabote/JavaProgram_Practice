class Parent 
{
    void fun()
    {
        System.out.println("Parent");
    }
}
class child extends Parent{
    void fun()
    {
        System.out.println("child");
    }
}
class Client10
{
    public static void main(String args[])
    {
        Parent obj = new child();
        obj.fun();
        
    }
}