class Parent{
    Parent(){
        System.out.println("Parent constructor");
    }
    void fun(){
        System.out.println("In fun Parent");
    }
}
class child extends Parent{
    child(){
        System.out.println("Child constructor");
    }
    void fun(int x){
        System.out.println("In fun child");
    }
}
class Client680{
    public static void main(String args[]){
        Parent obj= new child();
        obj.fun();
    }
}