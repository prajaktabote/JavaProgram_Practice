class Parent{
      public void fun(){
        System.out.println("Parent fun");
    }
}
class Child extends Parent{
   void fun(){
        System.out.println("Child fun");
    }
}
class Client686{
    public static void main(String args[]){
        Parent p = new Child();
        p.fun();
    }
}