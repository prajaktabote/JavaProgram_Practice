class Demo extends Exception{
    Demo(String str){
    super(str);
    }
    }
class parent{
    parent(){
        System.out.print("parent constructor");
    }
    void m1() throws Demo{
        System.out.println("In parent-m1");
        throw new Demo("Exception throws");
    }
}
class child extends parent{
    child(){
        System.out.println("child constructor");
    }
    void m1(){
        System.out.println("In child m1");
    }
}
class Client58{
    public static void main(String args[]){
        parent p= new child();
        try{
            p.m1();
        }catch(Demo d){
            System.out.println(d);
        }
    }
}