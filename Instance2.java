class Instance2
{
    int x=10;
    static int y=20;
    Instance2()
    {
        System.out.println("In constructor");
    }
    static 
    {
        System.out.println("In static block1 ");
    }
    {
        System.out.println("In instance block1");
    }
    public static void main(String args[])
    {
        Instance2 obj = new Instance2();
    }
    static{
        System.out.println("In static block2");
    }
    {
        System.out.println("In instance block2");
    }
}