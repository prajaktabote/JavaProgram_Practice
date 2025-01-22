class Parent{
    int x=10;
    static int y=20;
    Parent(){
        System.out.println("In parent CONSTRUCTOR");
    }
    void m1(){
        System.out.println("In m1-parent");
    }
    static void m2(){
        System.out.println("In m2-parent");
    }
}
class Child extends Parent{
    int x=50;
    static int y= 600;
    Child(){
        System.out.println("In child constructor");
    }
    void m1(){
        System.out.println("In m1-child");
    }
    static void m3(){
        System.out.println("In m3- child");
    }
}
class Client698{
    public static void main(String args[]){
        Parent obj= new Parent();
        obj.m1();
        obj.m2();

        Child obj1= new Child();
        obj1.m1();
        obj1.m3();

        Parent obj2 = new Child();
        obj2.m1();
       // obj2.m3();
    }
}