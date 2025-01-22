//Access specifier in overriding
class Parent{
    protected void fun()//access specifier
    {
        System.out.println("parent fun");
    }
}
class child extends Parent
{
    //protected void fun() ;then run the program
    void fun() //access specifier default
    {
        System.out.println("Child fun");
    }
}
class Client21
{
    public static void main(String args[])
    {
        Parent p = new child();
        p.fun();
    }
}

//fun () in child canot override fun() in parent void fun()default accesss spcifier
//attempting to assign weaker access privalge;was public 