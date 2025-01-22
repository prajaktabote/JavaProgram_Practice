class parent{
    parent(){
        System.out.println("Parent constructor");
    }
    void fun(){
        System.out.println("In fun");
    }
}
class Child extends parent{
    Child(){
        System.out.println("child constructor");
    }
    void gun(){
        System.out.println("In gun");
    }
}
class Client53{
    public static void main(String args[]){
        Child obj1= new Child();
       
       ---------------------- obj1.fun();
        obj1.gun();

        parent obj2=new parent();
        obj2.fun();
        //obj2.gun();
    }

}