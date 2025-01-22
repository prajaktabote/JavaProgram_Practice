//Hidden this referance
class Instance6
{
    int x=10;
    Instance6()
    {
        System.out.println("No argument constructor");
    }
    Instance6(int x)
    {
        System.out.println("In para Constructor");
    }
    public static void main(String args[])
    {
        Instance6 obj1 = new Instance6();
        Instance6 obj2 = new Instance6(10);
    }
}