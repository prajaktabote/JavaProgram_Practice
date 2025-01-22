class parent{
    static void fun(){
        System.out.println("In parent fun");
    }
}
class child extends parent{
    static void fun(){
        System.out.println("child fun");
    }
}
class Client64{
    public static void main(String args[]){
        parent p1= new parent();
        p.fun();

        child c=new child();
        c.fun();
        parent p2=new child();
        p2.fun();
    }
}