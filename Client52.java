class parent{
    parent(){
        System.out.println("parent");
    }
    void fun(int x){
        System.out.println("In parent fun");

    }
}
class Child extends parent{
    Child(){
        System.out.println("child");
    }
    void fun(){
        System.out.println("In child fun");
    }
}
class Client52{
    public static void main(String args[]){
        parent obj1=new Child();
        obj1.fun(5);
    }
}