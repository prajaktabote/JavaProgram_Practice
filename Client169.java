class parent{
    int x=10;
    static int y=20;
    static{
        System.out.println("parent static block");
    }
    parent(){
        System.out.println("In parent constructor");
    }
    void methodOne(){
        System.out.println(x);
        System.out.println(y);

    }
    static void methodTwo(){
        System.out.println(y);
    }
}
class child extends parent{
    static{
        System.out.println("in child constructor");
    }
}
class Client169{
    public static void main(String args[]){
        child obj= new child();
        obj.methodOne();
        obj.methodTwo();
    }
}