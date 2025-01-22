class Parent{
    Parent(){
        System.out.println("Parent constructor");
    }
   private void fun(){
        System.out.println("In fun");
    }
}
    class child extends Parent{
        child(){
            System.out.println("Child constructor");

        }
        void gun(){
            System.out.println("In gun");
        }
    }
class Client678{
    public static void main(String args[]){
        child obj= new child();
        obj.fun();
        obj.gun();

     // Parent obj1= new Parent();
      //obj1.fun();
     // obj1.gun();
     //Parent obj1= new child();
     //obj1.fun();
     //obj1.gun();


     child obj1= new Parent();
     obj1.fun();
     obj1.gun();



    }
}