interface Demo1{
    default void fun(){
        System.out.println("In fun Demo1");
    }
}
interface Demo2{
    default void fun(){
        System.out.println("In fun Demo2");
    }
}
class DemoChild implements Demo1,Demo2{
    public void fun(){
        System.out.println("In fun Demo child");
    }
}
class Client690{
    public static void main(String args[]){
        Demo1 obj= new DemoChild();
        obj.fun();
        Demo2 obj1= new DemoChild();
        obj1.fun();
        DemoChild obj2 = new DemoChild();
        obj2.fun(); 

    }
}