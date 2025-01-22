class Parent{
    Parent(){
        System.out.println("Parent constructor");

    }
    void fun(){
        System.out.println("In parent fun");
    }
}
class child extends Parent{
    child(){
        System.out.println("Child constructor");
    }
    void fun(){
        System.out.println("In child method");
    }
}
class Client679{
    public static void main(String args[]){
        Parent obj= new child();
        obj.fun();
    }
}