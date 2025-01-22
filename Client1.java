class Parent{
    int x=10;
    Parent()
    {
        System.out.println("In parent constructor");
    }
    void access()
    {
        System.out.println("Parent Instance");
    }
}
class child extends Parent
{
    int Y=20;
    child()
    {
    System.out.println("Inc child constructor");
    System.out.println(x);
    System.out.println(Y);
    }

}

class Client1{
    public static void main(String args[])
    {
        child obj = new child();
        obj.access();
    }
}