class Outer{
    class Inner{
        void m1(){
            System.out.println("In m1-Inner");
        }
    }
    void m2(){
        System.out.println("In m2-outer");
    }
}
class Client695{
    public static void main(String args[]){
        Outer obj = new Outer();
        obj.m2();
        Inner obj1= new Outer().new Inner();
        obj1.m1();

    }
}