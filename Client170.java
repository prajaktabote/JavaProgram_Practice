class parent{
    static int x=10;
    static{
        System.out.println("In parent static block");
    }
    static void access()
    {
        System.out.println(x);
    }
}
class child extends parent{
    static{
        System.out.println("In child static block");
        System.out.println(x);
        access();
    }
}
class Client170{
    public static void main(String args[]){
        System.out.println("In main");
        child obj=new child();
    }
}