class Parent{
  final  void fun(){
        System.out.println("Parent fun");
    }
}
class Child extends Parent{
    private  void fun(){
        System.out.println("Child method");

    }
}
class Client687{
    public static void main(String args[]){
        Parent p= new Child();
        p.fun();

    }
}