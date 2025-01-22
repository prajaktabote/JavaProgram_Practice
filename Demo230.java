class Parent{
    int x=10;
    void m1(){
        System.out.println("In parent-m1");
    }
}
class Child extends Parent{
    int a=20;
    void m1(){
        System.out.println("In child m1");

    }
}
class Demo230{
       Demo230(Parent p){
        System.out.println("In parent constructor");
        p.m1();
       }
       Demo230(Child c){
        System.out.println("In child constructor");
        c.m1();
       }
       public static void main(String args[]){
        Demo230 obj= new Demo230(new parent());
        Demo230 obj2=new Demo230(new Child());
       }
       
}