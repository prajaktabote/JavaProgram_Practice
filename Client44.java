class Parent
{
    int x=10;
    void m1()
    {
        System.out.println("In parent -m1");

        
    }
}
class Child extends Parent{
    int a = 20;
    void m1()
    {
        System.out.println("In child-m1");
    }
}
class Client44
{
    Client44(Parent p)
    {
        System.out.println("In constructor parent");
        p.m1();
    }
    Client44(Child c)
    {
        System.out.println("In constructor child");
        c.m1();

    }
    public static void main(String args[])
    {
        Client44 obj1 = new Client44(new Parent());
        Client44 obj2 = new Client44(new Child()); 
    }
}