class Parent
{
    private void fun()
    {
        System.out.println("Parent fun");
    }
}
class child extends Parent{
    void fun()
    {
        System.out.println("Child fun");
    }
}
class Client22
{
    public static void main(String args[])
    {
        Parent p= new child();
        p.fun();
    }
}