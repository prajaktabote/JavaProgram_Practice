class Parent{
   final  void fun(){
        System.out.println("Parent fun");
    }
}
class Child extends Parent{
  final void fun(){
        System.out.println("child fun");
    }
}
class Client73
{
    public static void main(String args[]){
        Parent p= new Child();
        p.fun();
    }
}