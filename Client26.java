abstract class Parent{
    void career()
    {
        System.out.println("Engineer");
    }
    abstract void marry();
}
class child extends Parent{
    void marry()
    {
        System.out.println("Arayan");
    }
}
class Client26
{
    public static void main(String args[])
    {
        child obj= new child();
        obj.marry();
        obj.career();
    }
}