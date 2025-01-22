
//static in Inheritance(Parent class)
class Parent{
    static{
        System.out.println("In parent static block");

    }
}
class child extends Parent{
    static 
    {
        System.out.println("In child static block");
    }
}
class Client2
{
    public static void main(String args[])
    {
        child obj = new child();
    }
}