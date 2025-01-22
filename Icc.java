class Icc
{
    Icc()
    {
        System.out.println("In Icc constructor");
    }
}
class Bcci extends Icc
{
    Bcci()
    {
        System.out.println("In Bcci constructor");
    }
}
class Ipl extends Bcci{
    Ipl()
    {
        System.out.println("In Ipl");
    }
    class client{
    public static void main(String args[])
    {
        Bcci Jayshah = new Bcci();
    }
}

}