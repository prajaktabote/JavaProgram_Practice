class Parent{
    char fun()
    {
        System.out.println("Parent fun");
        return 'A';
    }
}
class child extends Parent
{
    int fun()
    {
        System.out.println("child fun");
        return 10;
    }
}
class Client20
{
    public static void main(String args[])
    {
        Parent p = new child();
        p.fun();
    }
}