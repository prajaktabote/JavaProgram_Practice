class Demo
{
    
    void fun(String str)
    {
        System.out.println("String");
    }
    void fun(StringBuffer str1)
    {
        System.out.println("StringBuffer");
    }
}
class Client18
{
    public static void main(String args[])
    {
        Demo obj = new Demo();
        obj.fun("coreWeb");
        obj.fun (new StringBuffer("coreweb"));
       
    }
}