class Parent
{
    Parent()
    {
        System.out.println("Parent");
    }
    void fun(int x)
    {
        System.out.println("In parent");
    }
}
class child extends Parent{
    child()
    {
        System.out.println("In child constructor");
    }
    void fun()
    {
        System.out.println("In child fun");
    }
}
class Client14
{
    public static void main(String args[])
    {
        Parent  obj = new child();
        obj.fun();
    }
}

//error:= method fun in class parent canot be applied to given types.no argument