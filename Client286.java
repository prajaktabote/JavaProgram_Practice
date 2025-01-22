class parent{
    int x=10;
    static int Y=20;
    parent(){
        System.out.println("In parent-constructor");
    }
void m1(){
    System.out.println("In m1-parent");
}
static void m2(){
    System.out.println("In m2-parent");
}
}
class child extends parent{
    int a=50;
    static int b=60;
    child(){
        System.out.println("In child constructor");
    }
    void m1(){
        System.out.println("in m1-child");
    }
    static void m3(){
        System.out.println("In m3-child");
    }
}
class Client286{
    public static void main(String args[]){
        parent obj=new parent();
        obj.m1();
        obj.m2();

        child obj3()=new child();
        obj3.m1();
        obj3.m2();
        obj3.m3();
    }
}
