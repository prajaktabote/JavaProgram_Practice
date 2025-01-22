//differance between static and instance method working in java program
class Differance
{
    public static void main(String args[])
    {
        display();   //calling without object
        Differance t= new Differance();
        t.show();
    }
    static void display()
    {
        System.out.println("programming is amazing");
    }
    void show()
    {
        System.out.println("Java is awesome");
    }
}

