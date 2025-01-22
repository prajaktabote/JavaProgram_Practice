class Outer
{
    int x=10;
    static int y = 20;
    class Inner
    {
        final static int a=30;
    }
}
class Client41
{
    public static void main(String args[])
    {
        System.out.println(Outer.y);
     //try using static it is called as nested static class
     Outer obj = new Outer();
     System.out.println(obj.x);
     //Outer.Inner obj1 = onj.new Inner()l
     System.out.println(obj.new Inner().a);
    }
}