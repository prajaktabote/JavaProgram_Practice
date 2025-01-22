class Parent{
    Parent(){
        System.out.println("Parant Constructor");
    }
    void Property(){
        System.out.println("Home,Gold");
    }
    void Marry(){
        System.out.println("Prabhas");
    }

}
class Child extends Parent{
    Child(){
        System.out.println("child constructor");

    }
    void marry(){
        System.out.println("Arayan");
    }
}
class Client59{
    public static void main(String args[]){
        Child obj= new Child();
        obj.Property();
        obj.Marry();
    }
}