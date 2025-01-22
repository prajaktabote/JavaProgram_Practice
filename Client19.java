class Demo{
    void fun(Object obj)
    {
        System.out.println("object");
    }
    void fun(String str)
    {
        System.out.println("String");
    }
}
class Client19
{
    public static void main(String args[])
    {
        Demo obj = new Demo();
        obj.fun("Coreweb");
        obj.fun(new StringBuffer("Coreweb"));
        obj.fun(null);
    }
}

//method madhe object use kele ki main method madhe all accesss dete
// object and string both acsess but always priorty to child.