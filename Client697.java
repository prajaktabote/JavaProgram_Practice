class Outer{
    void m1(){
        System.out.println("M1-outer");
    }
    static class Inner{
        void m1(){
            System.out.println("m1-inner");
        }
    }
}
class Client697{
    public static void main(String args[]){
      //  Outer.Inner obj= new outer.Inner();
      //Outer obj=new Outer().new Inner();
      Outer obj = new Outer();
        obj.m1();
        
    }
}