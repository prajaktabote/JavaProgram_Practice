class Demo{
    Demo(){
        System.out.println("In constructor Demo");
    }
}
class DChild extends Demo{
    DChild(){
        System.out.println("In constructor Demo");
    }
}
class Parent{
    Parent(){
        System.out.println("in m1-parent");
        return new Demo();
    }
}
class child{
    child(){
        System.out.println("In child constructor");
    }

DChild m1(){
    System.out.println("In m1-child");
    return newDemoChild();
}
}
class Client699{
    public static void main(String args[]){
        Parent p = new Child();
        p.m1();
    }
}
