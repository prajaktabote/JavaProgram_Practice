class parent{
    int x=10;
    void m1(){
        System.out.println("In parent-m1");
    }
}
class child extends parent{
    int a=20;
    void m1(){
        System.out.println("In child m1");
    }
}
class Client285{
    Client285(parent p){
        System.out.println("In constructor parent");
        p.m1();
    }
    Client285(child c){
        System.out.println("In constructor");
        c.m1();
    }
    public static void main(String args[]){
        Client285 obj1=new Client285(new parent());
        Client285 obj2=new Client285(new child());
    }
}