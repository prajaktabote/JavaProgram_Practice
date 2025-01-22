class Instance
{
    int x=10;
    Instance()
    {
        System.out.println("constructor");

    }
    {
        System.out.println("Instance Block !");
    }
    public static void main(String args[])
    {
        Instance obj = new Instance();
        System.out.println("main");
        {
            System.out.println("Instance block2 !");
        }
    }
}