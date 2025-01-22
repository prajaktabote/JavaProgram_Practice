class Instance3
{
    int x=10;
    Instance3()
    {
        System.out.println("In constructor");
    }
    void fun()
    {
        System.out.println(x);

    }
    public static void main(String[] args)
    {
        Instance3 obj1 = new Instance3();
        obj1.fun();
    }
}