//Accesss Specifier in  overriding
class Parent{
   public void fun(){
        System.out.println("Parent Fun");
    }
}
class Child extends Parent{
     void fun(){
        System.out.println("Child fun");
    }
}
class Client76{
    public static void main(String args[]){
        Parent p=new Child();
        p.fun();
    }
}