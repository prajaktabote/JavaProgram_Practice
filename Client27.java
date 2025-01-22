abstract class Smastani
{
    void quality()
    {
        System.out.println("excellent");
    }
    abstract void price();
}
class Baramati extends Smastani{
    void price()
    {
        System.out.println("Price of Mastani");
    }
}
class Client27
{
    public static void main(String args[])
    {
        Smastani obj = new Baramati();
        obj.quality();
        obj.price();
    }
}