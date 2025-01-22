class Outer
{
    int x =10;
    static int y=20;   //static variable declaration is not allowed inside any method
    void m1()
    {
        int a=30;
        static int b=30; //illegal start of expression
    }
    public static void main(String args[])
    {
        int p = 50;
        static int q=90;//illlegal start of expression.
    }

}