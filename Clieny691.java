class Demo{
    static void fun(){
        System.out.println("In fun method");
    }
}
class DemoChild extends Demo{

}
class Clieny691{
    public static void main(String args[]){
        DemoChild obj = new DemoChild();
        obj.fun();
    }
}