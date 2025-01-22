class Demo
{
    Demo()
    {
        System.out.println("In constructor-Demo");
    }    
}
class DemoChild extends Demo
{
    DemoChild()
    {
        System.out.println("In constructor-Demo-child");
    }
}
class Parent
{
    Parent()
    {
        System.out.println("In parent constructor");
    }
    Demo m1()
    {
        System.out.println("In m1-parent");
    }
}


class Child extends Parent{
    Child()
    {
        System.out.println("In constructor- child");
    }
    DemoChild m1()
    {
        System.out.println("In m1 child");
    }
}
class Client43
{
    public static void main(String args[])
    {
        Parent p = new Child();
        p.m1();
    }
}

