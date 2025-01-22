class Parent{
    private void fun(){
        System.out.println("Parent fun");
    }
}
class Child extends Parent{
    void fun(){
        System.out.println("child fun");
    }
}
class Client75{
    public static void main(String args[]){
        Parent p=new Child();
        p.fun();
    }
}