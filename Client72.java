class Parent{
   static void fun(){
        System.out.println("parent fun");
    }
}
class Child extends parent{
    void fun(){
        System.out.println("child fun");
    }
}
class Client72{
    public Static void main(String args[]){
        Parent p=new Child();
        p.fun();
    }
}