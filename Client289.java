class Outer{
    void m1(){
        System.out.println("In m1-outer");
        class Inner{
            void m1(){
                System.out.println("In m1-inner");
            }
        }
        Inner obj=new Inner();
        obj.m1();
    }
    void m2(){
        System.out.println("in m2-outer");
    }
    
}
class Client289{
    public static void main(String args[]){
        Outer obj=new Outer();
        obj.m1();
        obj.m2();
    }
}