class Demo{
    static void fun(){
        System.out.println("In fun");
    }
}
class DemoChild extends Demo{

}
class Client294{
    public static void main(String args[]){
        DemoChild obj= new DemoChild();
        obj.fun();
    }
}