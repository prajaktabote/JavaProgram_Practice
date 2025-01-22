class Demo{
    Demo(){
        System.out.println("In constructor-Demo");
    }
}
class DemoChild extends Demo{
    DemoChild(){
        System.out.println("In constructor demo child");
    }
}
class parent{
    parent(){
        System.out.println("In parent constructor");
    }
    Demo m1(){
        System.out.println("in m1-parent");
    }
}
class Child extends parent{
    Child(){
        System.out.println("In constructor child");
         DemoChild m1(){
            System.out.println("In m1-child");
         }
         }
}