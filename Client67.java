abstract class Parent{
    void career(){
        System.out.println("Engineer");
    }
    abstract void marry();
}
class Child extends Parent{
    void marry(){
        System.out.println("Aryan");
    }
}
class Client67{
    public static void main(String args[]){
        Child obj=new Child();
        obj.marry();
        obj.career();
    }
}