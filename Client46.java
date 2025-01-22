class Parent
{
    int x = 10;
    void m1()
    {
        System.out.println("In parent-m1");
    }
}
class child extends Parent
{
    int a= 20;
    void m1()
    {
        System.out.println("In child-m1");
    }
}
class Client46
{
    Client46(Parent p)
    {
        System.out.println("In constructor parameter");
        p.m1();
    }
    Client46 (child c)
    {
        System.out.println("In constructor child");
        c.m1();
    }
    public static void main(String args[])
    {
        Client46 obj = new Client46(new Parent());
        Client46 obj2 = new Client46(new child());

    }
}