class Parent{
    static void fun()
    {
        System.out.println("In parent fun");
    }
}
class Child extends Parent{
   static void fun(){
        System.out.println("Child fun");
    }
}
class Client71{
    public static void main(String args[]){
        Parent p1=new Parent();
        p1.fun();
        Child c1=new Child();
        c1.fun();
        Parent p2=new Parent();
        p2.fun();


    }
    
}