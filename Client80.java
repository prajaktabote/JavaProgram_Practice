class Parent{
    char Fun(){
        System.out.println("Parent Fun");
        return 'A';
    }
}
class Child extends Parent{
    int Fun(){
        System.out.println("Child Fun");
        return 10;
    }
}
class Client80{
    public static void main(String args[]){
        Parent p=new Child();
        p.Fun();
    }
}