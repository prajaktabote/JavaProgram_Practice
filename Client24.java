class Parent
{
    void fun()
    {
        System.out.println("parent fun");
    }
}
class child extends Parent
{
    void fun()
    {
        System.out.println("child fun");
    }
}
class Client24
{
    public static void main(String args[])
    {
        Parent p = new child();
        p.fun();
        
    }
}

//overide method is static 
//viceversa pan chalt nahi