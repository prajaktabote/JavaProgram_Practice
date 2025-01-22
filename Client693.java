interface Demo{
    int x=10;
    void fun();
}
class Demo2{
    static int x=20;


   // int x=10;
    //void fun();
}
class DemoChild implements Demo{
    public void fun(){
        System.out.println(x);
        System.out.println(Demo.x);
    }
}
class Client693{
    public static void main(String args[]){
        Demo obj= new DemoChild();
        obj.fun();
    }
}