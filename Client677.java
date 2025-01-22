class Parent{
    Parent(){
        System.out.println("Parent construcror");
    }
    void property(){
        System.out.println("Home, car,Gold");
    }
    void Education(){
        System.out.println("Doctor");
    }
}
class Child extends Parent{
    Child(){
        System.out.println("child constructor");
    }
    void Educatio(){
        System.out.println("English");
    }
}
class Client677{
    public static void main(String args[]){
        Child obj= new Child();
        obj.property();
        obj.Education();
    }
}
