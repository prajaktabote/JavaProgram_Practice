interface A {
    int x = 10;
}
interface M{
    int x=20;
}
class Child implements A,M{
    int x=30;
    void fun()
    {
        System.out.println(x);
    }
}
class Client34
{
    public static void main(String args[])
    {
        Child obj = new Child();
        obj.fun();
    }
}