class Instance7
{
    int x=10;
    Instance7()
    {
        System.out.println("In no aruments constructor");
    }
    Instance7(int x)
    {
        this();
        System.out.println("In para");
    }
     public static void main(String args[])
    {
        Instance7 obj = new Instance7(50);
    }
}