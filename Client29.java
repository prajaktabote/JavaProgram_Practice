class Singleton
{
    static Singleton obj = new Singletone();
    private Singleton()
    {
        System.out.println("constructor");
    }
    static Singletone getObject()
    {
        return obj;
    }

}
class Client29{
       public static void main(String args[])
       {
        Singleton obj1 = Singleton.getObject();
        System.out.println(obj1);

        Singleton obj2 = Singleton.getObject();
        System.out.println(obj2);

       }
}