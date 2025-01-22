class Client7
{
    void fun(int x)
    {
        System.out.println(x);
    }

void fun(float y)
{
     System.out.println(y);
}
void fun(Client7 obj)
{
    System.out.println("In client7 para");
    System.out.println(obj);
}
public static void main(String args[])
{
    Client7 obj = new Client7();
    obj.fun(10);
    obj.fun(18.5f);
    Client7 obj1 = new Client7();
    obj1.fun(obj);
    obj.fun(obj);
}
}