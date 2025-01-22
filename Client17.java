class Demo
{
    void fun( int x, float y)
    {
        System.out.println("Int - float para ");
    }
    void fun(float x, int y)
    {
        System.out.println("float- Int para");
    }
}
class Client17
{
    public static void main(String args[])
    {
        Demo obj = new Demo();
        obj.fun(10,10);
    }
}

//error : at compile time
//ambiguity occur referance to fun is ambigious