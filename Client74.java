class Parent{
    void fun(){
        System.out.println("parent fun");
    }
}
class Child extends Parent{
    private void fun(){
        System.out.println("Child fun");
    }
}
class Client74{
    public static void main(String args[]){
        Parent p=new Child();
        p.fun();
    }
}