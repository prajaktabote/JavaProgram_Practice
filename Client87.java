class Parent8{
    int x=10;
    void m1(){
        System.out.println("In parent-m1");
    }
    
}
class Child extends Parent8{
    int a=20;
    void m1(){
        System.out.println("In child m1");
    }
}
class Client87{
    Client87(Parent8 p)
    {
        System.out.println("In constructor Parent");
        p.m1();
    }
    Client87(Child c){
        System.out.println("In constructor child");
        c.m1();
    }
    public static void main(String args[]){
        Client87 obj1=new Client87(new Parent8());
        Client87 obj2=new Client87(new Child());
    }
}