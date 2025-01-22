class Instance4
{
    int x=10;

    Instance4()
    {
        System.out.println("in constructor");
        System.out.println(this);
        System.out.println(this.x);
    }
    void fun()
    {
        System.out.println(this);
        System.out.println(x);

    }
    public static void main(String args[])
    {
        Instance4 obj = new Instance4();
        System.out.println(obj);
        obj.fun();
    }
}