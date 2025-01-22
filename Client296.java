interface Demo1{
    void fun();
}
interface Demo2{
    void fun();
}
class DemoChild implements Demo1,Demo2{
    public void fun(){
        System.out.println("In fun Child");
    }
}
class Client296{
    public static void main(String args[]){
        Demo1 obj= new DemoChild();
        Demo2 obj1=new DemoChild();
        obj.fun();
        obj1.fun();
    }
}